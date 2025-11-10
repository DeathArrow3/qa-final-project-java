package com.liviuoloi.homework.tema6;

public class InvadidUserDataException extends Exception {
    public InvadidUserDataException(String message, String username) {

        super(message + username);
    }
}
