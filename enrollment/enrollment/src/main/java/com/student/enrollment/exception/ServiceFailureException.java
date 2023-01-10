package com.student.enrollment.exception;

public class ServiceFailureException extends Exception {

    public ServiceFailureException(String errorMessage) {
        super(errorMessage);
    }
}
