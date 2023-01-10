package com.student.payment.exception;

public class PaymentApplicationException extends Exception {
    public PaymentApplicationException(String errorMessage) {
        super(errorMessage);
    }
}
