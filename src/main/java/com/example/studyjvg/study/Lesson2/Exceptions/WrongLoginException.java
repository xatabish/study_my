package com.example.studyjvg.study.Lesson2.Exceptions;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {

        super(message);
    }
}
