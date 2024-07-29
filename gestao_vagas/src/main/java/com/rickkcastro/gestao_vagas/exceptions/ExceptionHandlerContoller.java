package com.rickkcastro.gestao_vagas.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerContoller {

    private MessageSource menssageSource;

    public ExceptionHandlerContoller(MessageSource message) {
        this.menssageSource = message;
    }

    /**
     * Este método é um manipulador de exceções para
     * MethodArgumentNotValidException.
     * Ele é usado para lidar com erros de validação que ocorrem quando os
     * parâmetros
     * de solicitação são associados a um argumento de método.
     *
     * @param e A MethodArgumentNotValidException que ocorreu.
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErrorMessageDTO>> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException e) {
        // Crie uma lista para armazenar as mensagens de erro
        List<ErrorMessageDTO> dto = new ArrayList<>();

        // Itere sobre os erros de campo no resultado de associação
        e.getBindingResult().getFieldErrors().forEach(err -> {
            // Obtenha a mensagem de erro localizada para o erro de campo
            String message = menssageSource.getMessage(err, LocaleContextHolder.getLocale());

            // Crie um objeto ErrorMessageDTO com a mensagem de erro e o nome do campo
            ErrorMessageDTO error = new ErrorMessageDTO(message, err.getField());

            // Adicione a mensagem de erro à lista
            dto.add(error);
        });

        return new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
    }
}
