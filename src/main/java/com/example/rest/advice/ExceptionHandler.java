package com.example.rest.advice;

import com.example.rest.InvalidCredentials;
import com.example.rest.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice()
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> inCredHandler(InvalidCredentials e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> unUserHandler(UnauthorizedUser e) {
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
