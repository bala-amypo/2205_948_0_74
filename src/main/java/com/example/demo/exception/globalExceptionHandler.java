package com.example.demo.exception;

import org.springframework.web.bind.annotation.*;


@RestControllerAdvice
public class globalExceptionHandler{
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleFieldError(MethodArgumentNotValidException ex){
         Map<String,String> error = new HashMap<>();
    }
}