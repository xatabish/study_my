package com.example.studyjvg.study.Lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class ControllerCalculate {
    @Autowired
    private final Service service;

    public ControllerCalculate(Service service) {
        this.service = service;
    }


    @GetMapping
    public String hello() {

        return "Добро Пожаловать в Калькулятор";
    }

    @GetMapping("/plus")
    public int addition(@RequestParam int a, @RequestParam int b) {
       return service.addition(a , b);
    }

    @GetMapping("/minus")
    public int minus(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/divide")
    public int divide(@RequestParam int a, @RequestParam int b) {
        return a / b;
    }

}
