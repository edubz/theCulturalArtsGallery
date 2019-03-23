package com.culturalgalleryarts.exceptions;

public class BadRequest extends RuntimeException {

    public BadRequest() {}

    public BadRequest(String message) {
        super(message);
    }
}