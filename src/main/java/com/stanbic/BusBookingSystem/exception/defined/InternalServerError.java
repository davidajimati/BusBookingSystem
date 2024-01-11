package com.stanbic.BusBookingSystem.exception.defined;

public class InternalServerError extends  RuntimeException{
    public InternalServerError(Exception e) {
        super(e);
    }
}
