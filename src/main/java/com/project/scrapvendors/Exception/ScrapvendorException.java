package com.project.scrapvendors.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Data
public class ScrapvendorException {

    private final String mesage;
    private final Throwable throwable;
    private final HttpStatus httpStatus;



}
