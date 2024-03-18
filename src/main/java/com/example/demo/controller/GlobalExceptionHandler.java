package com.example.demo.controller;

import com.example.demo.controller.responses.ErrorResponse;
import com.example.demo.service.exceptions.UserServiceExceptions;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({
        UserServiceExceptions.NotValidDocumentType.class
    })
    public ResponseEntity<ErrorResponse> badRequest(RuntimeException e, HttpServletRequest request){

        ErrorResponse errorMessage = ErrorResponse.builder()
                .errorMessage("Tipo de documento no valido")
                .build();
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler({
            UserServiceExceptions.NotFound.class
    })
    public ResponseEntity<ErrorResponse> notFound(RuntimeException e, HttpServletRequest request){
        ErrorResponse errorMessage = ErrorResponse.builder()
                .errorMessage("Usuario no encontrado")
                .build();
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }
}
