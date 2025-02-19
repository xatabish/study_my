package com.example.studyjvg.study.Lesson5_6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class EmployeeStreamController {
    private final EmployeeStreamService emp;

    public EmployeeStreamController(EmployeeStreamService emp) {
        this.emp = emp;
    }

    @GetMapping("/add")
    public String add(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int salary, @RequestParam int id) {
        Person person = new Person(firstName, lastName, salary, id);
        emp.EmployeeBook.add(person);

        return "ADDED  <3  ";
    }

    @GetMapping("/max-salary")
    public String msxSalary(@RequestParam int id) {
        Optional<Integer> maxSalary = emp.maxSalary(id);

        return maxSalary.map(salary -> "Максимальная зарплата в отделе " + id + ": " + salary)
                .orElse("Нет сотрудников в отделе под номером " + id);

    }

    @GetMapping("/min-salary")
    public String minSalary(@RequestParam int id) {
        Optional<Integer> minSalary = emp.minSalary(id);

        return minSalary.map(salary -> "Минимальная зарплата в отделе " + id + ": " + salary)
                .orElse("Нет сотрудников в отделе под номером " + id);


    }

    @GetMapping ("/allForId")
    public String EmployeeInDepartmentId (@RequestParam int id) {
        return emp.EmployeeInDepartmentId(id);

    }

    @GetMapping ("/all")
    public String AllEmployees() {
       return emp.EmployeeBook.toString();
    }




}
