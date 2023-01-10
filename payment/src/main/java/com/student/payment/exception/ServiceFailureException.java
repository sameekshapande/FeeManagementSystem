package com.student.payment.exception;

public class ServiceFailureException extends Exception {

    public ServiceFailureException(String errorMessage) {
        super(errorMessage);
    }
}
