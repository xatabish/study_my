package com.example.studyjvg.study.Lesson1_8;

@org.springframework.stereotype.Service

public class Service {

    public int addition(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Аргументы не должны быть равны нулю");
        }
        return a + b;
    }

    public int minus(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Аргументы не должны быть равны нулю");
        }
        return a - b;
    }

    public int multiply(int a, int b) {
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Аргументы не должны быть равны нулю");
        }
        return a * b;
    }

    public int divide(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
        return a / b;
    }


}
