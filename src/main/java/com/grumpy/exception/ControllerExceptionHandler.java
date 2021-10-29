package com.grumpy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.PRECONDITION_FAILED);
    }
}
