package com.ApiDioProjeto.apiDio.controllers.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
////    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
////
////    @ExceptionHandler(IllegalArgumentException.class)
////    public ResponseEntity<String> handleIllegal(IllegalArgumentException exception){
////        return new ResponseEntity<>(exception.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
////    }
////    @ExceptionHandler(NoSuchElementException.class)
////    public ResponseEntity<String> handleNoSuch(NoSuchElementException exception){
////        return new ResponseEntity<>("Not found", HttpStatus.NOT_FOUND);
////    }
//
////    @ExceptionHandler(Exception.class)
////    public ResponseEntity<String> handleExcpetion(Exception exception){
////        var message = "server error";
////        logger.error(message, exception);
////        return new ResponseEntity<>("Unexpected server error,see the logs", HttpStatus.INTERNAL_SERVER_ERROR);
////    }
//}
