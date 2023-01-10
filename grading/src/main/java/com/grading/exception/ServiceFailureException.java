package com.grading.exception;

public class ServiceFailureException extends Exception {

    public ServiceFailureException(String errorMessage) {
        super(errorMessage);
    }
}
