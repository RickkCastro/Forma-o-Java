package com.rickkcastro.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rickkcastro.gestao_vagas.modules.candidate.dto.AuthCandidateRequestDTO;
import com.rickkcastro.gestao_vagas.modules.candidate.useCases.AuthCandidadeUseCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/candidate")
public class AuthCandiadateController {

    @Autowired
    private AuthCandidadeUseCase authCandidadeUseCase;

    @PostMapping("/auth")
    public ResponseEntity<Object> auth(@RequestBody AuthCandidateRequestDTO authCandidateRequestDTO) {
        try {

            var token = this.authCandidadeUseCase.execte(authCandidateRequestDTO);
            return ResponseEntity.ok().body(token);

        } catch (Exception e) {

            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(e.getMessage());
        }
    }

}
