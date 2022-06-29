package com.example.user.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class ExceptionService {

    @ExceptionHandler(com.example.user.exception.UserIdException.class)
    ResponseEntity<com.example.user.exception.UserIdException> handleException(com.example.user.exception.UserIdException err){
        com.example.user.exception.UserErrorResponse uer = new com.example.user.exception.UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered ID "+err.getMessage()+" invalid.");
        return new ResponseEntity(uer, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(com.example.user.exception.UserNameException.class)
    ResponseEntity<com.example.user.exception.UserNameException> handleException(com.example.user.exception.UserNameException err){
        com.example.user.exception.UserErrorResponse uer = new com.example.user.exception.UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered USERNAME "+err.getMessage()+" invalid.");
        return new ResponseEntity(uer, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CPFException.class)
    ResponseEntity<CPFException> handleException(CPFException err){
        UserErrorResponse uer = new com.example.user.exception.UserErrorResponse();
        uer.setStatus(HttpStatus.NOT_FOUND.value());
        uer.setMessage("You have entered CPF "+err.getMessage()+" invalid.");
        return new ResponseEntity(uer,HttpStatus.NOT_FOUND);
    }
}