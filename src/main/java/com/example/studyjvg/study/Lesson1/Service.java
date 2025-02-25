package com.example.studyjvg.study.Lesson1;

import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Service

public class Service {

    public int addition(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }


}
