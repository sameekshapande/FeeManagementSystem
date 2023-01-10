package com.gradeSheetPreviousYear.exception;

public class ServiceFailureException extends Exception {

    public ServiceFailureException(String errorMessage) {
        super(errorMessage);
    }
}
