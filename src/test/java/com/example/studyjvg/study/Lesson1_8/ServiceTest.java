package com.example.studyjvg.study.Lesson1_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {

    @Test
    void addition() {
        int a = 1;
        int b = 4;
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Аргументы не должны быть равны нулю");
        }
        int c = a + b;
        System.out.println("ответ" + c);
    }

    @Test
    void minus() {
        int a = 1;
        int b = 4;
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Аргументы не должны быть равны нулю");
        }
        int c = a - b;
        System.out.println("ответ" + c);
    }

    @Test
    void multiply() {
        int a = 1;
        int b = 4;
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Аргументы не должны быть равны нулю");
        }
        int c = a * b;
        System.out.println("ответ" + c);
    }

    @Test
    void divide() {
        int a = 0;
        int b = 0;
        if (a == 0 && b == 0) {
            throw new IllegalArgumentException("Аргументы не должны быть равны нулю");
        }
        float c = a / b;
        System.out.println("ответ" + c);
    }
}