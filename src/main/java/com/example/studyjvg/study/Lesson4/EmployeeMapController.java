package com.example.studyjvg.study.Lesson4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employeeMap")

public class EmployeeMapController {

        Map<String, String> employeeBook = new HashMap<>();

    @GetMapping("/add")
    public String add(@RequestParam String firstName, @RequestParam String lastName) {
        if (employeeBook.containsKey(firstName) && employeeBook.containsValue(lastName)) {
            return "такой сотрудник уже существует! ";
        } else {
            employeeBook.put(firstName, lastName);
        }

        return "успешно добавленно";
    }

    @GetMapping("/remove")
    public String remove(@RequestParam String firstName, @RequestParam String lastName) {


        employeeBook.remove(firstName);

        return "успешно удаленно";
    }

    @GetMapping("/find")
    public String findPeople(@RequestParam String firstName, @RequestParam String lastName) {
        String people = firstName + " " + lastName;

        if (employeeBook.containsKey(firstName)) {
            return "да , такой сотрудник существует - " + people;
        } else {
            return "вы что то перепутали! такого сотрудника у нас нет!";
        }
    }
}
