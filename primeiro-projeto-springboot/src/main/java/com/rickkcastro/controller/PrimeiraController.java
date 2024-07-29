package com.rickkcastro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/primeiroMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "O id é " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam(defaultValue = "defaultName") String name) {
        return "O query param é " + name;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
        return "Os query params é " + allParams.entrySet();
    }

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodyParams(@RequestBody User user) {
        return "metodo com body params " + user.username + " " + user.age;
    }

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name) {
        return "metodo com headers " + name;
    }

    @PostMapping("/metodoComListHeader")
    public String metodoComListHeader(@RequestHeader Map<String, String> headers) {
        return "metodo com list headers " + headers.entrySet();
    }

    @GetMapping("/metodoResponseEntity")
    public ResponseEntity<Object> metodoResponseEntity() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Mensagem de erro.");
    }

    @GetMapping("/getUser/{Id}")
    public ResponseEntity<Object> getUser(@PathVariable int Id) {
        var user = new User("Rickk", 18);

        if (Id == 5) {
            return ResponseEntity.status(HttpStatus.FOUND).body(user);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User não encontrado!");
    }

    public record User(String username, int age) {
    }

}
