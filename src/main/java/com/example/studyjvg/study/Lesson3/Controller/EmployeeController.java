package com.example.studyjvg.study.Lesson3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    List<String> EmployeeBook = new ArrayList<>();

    @GetMapping("/add")
    public String add(@RequestParam String firstName, @RequestParam String lastName) {
        String people = firstName + " " + lastName;

        EmployeeBook.add(people);

        return "успешно добавленно";
    }

    @GetMapping("/remove")
    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
        String people = firstName + " " + lastName;

        EmployeeBook.remove(people);

        return "успешно удаленно";
    }

    @GetMapping("/find")
    public String findPeople(@RequestParam String firstName, @RequestParam String lastName) {
        String people = firstName + " " + lastName;

        if (EmployeeBook.contains(people)) {
            return "да такой сотрудник существует " + people;
        } else {
            return "вы что то перепутали! такого сотрудника у нас нет!";
        }
    }


}
