package com.project.scrapvendors.Exception;

public class ScrapvendorNotFoundException extends RuntimeException{
    public ScrapvendorNotFoundException(String message) {
        super(message);
    }

    public ScrapvendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
