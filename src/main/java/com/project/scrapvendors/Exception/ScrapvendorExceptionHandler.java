package com.project.scrapvendors.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ScrapvendorExceptionHandler {


    @ExceptionHandler(value = {ScrapvendorNotFoundException.class})
    public ResponseEntity<Object> handleScrapvendorNotFoundException( ScrapvendorNotFoundException scrapvendorNotFoundException)
    {
        ScrapvendorException scrapvendorException = new ScrapvendorException(
                scrapvendorNotFoundException.getMessage(),
                scrapvendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(scrapvendorException,HttpStatus.NOT_FOUND);
    }
}
