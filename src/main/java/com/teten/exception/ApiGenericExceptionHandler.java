package com.teten.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

@RestControllerAdvice
@Slf4j
public class ApiGenericExceptionHandler {
//    @ExceptionHandler({ ConstraintViolationException.class })
//    public ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException e) {
//
//        HashMap<String, Object> response = new HashMap<>();
//        var message = e
//                .getConstraintViolations()
//                .stream()
//                .map(f -> f.getPropertyPath() + " : " + f.getMessage())
//                .collect(Collectors.joining(", "));
//        response.put("message", message);
//
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
//    }
//
    @ExceptionHandler({ MethodArgumentNotValidException.class })
    public ResponseEntity<Object> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException e
    ) {

        HashMap<String, Object> response = new HashMap<>();

        var message = e
                    .getFieldErrors()
                    .stream()
                    .map(f -> f.getField() + " (value : " + f.getRejectedValue() + ") " + f.getDefaultMessage())
                    .collect(Collectors.joining(", "));

            response.put("message", message);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }

}
