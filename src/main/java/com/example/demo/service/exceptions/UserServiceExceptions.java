package com.example.demo.service.exceptions;

public abstract class UserServiceExceptions extends RuntimeException{
    public UserServiceExceptions(String message) {
        super(message);
    }

    public static class NotFound extends UserServiceExceptions{
        public NotFound(String message) {
            super(message);
        }
    }

    public static class NotValidDocumentType extends UserServiceExceptions{
        public NotValidDocumentType(String message) {
            super(message);
        }
    }
}
