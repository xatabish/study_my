package com.example.studyjvg.study.Lesson5_6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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

        if (firstName.isEmpty() || lastName.isEmpty()  ) {
           new RuntimeException("Имя или Фамилия не содержит ничего проверьте данные");

        }


        Person person = new Person(firstName, lastName, salary, id);


        emp.employeeBook.add(person);

        return "ADDED  <3  ";
    }

    @GetMapping("/max-salary")
    public Person  maxSalary(@RequestParam int id) {
        return emp.maxSalary(id)     ;
    }

    @GetMapping("/min-salary")
    public Person minSalary(@RequestParam int id) {
        return emp.minSalary(id);
    }

    @GetMapping("/allForId")
    public List<Person> EmployeeInDepartmentId(@RequestParam int id) {
        return emp.EmployeeInDepartmentId(id);

    }

    @GetMapping("/all")
    public String AllEmployees() {
        return emp.employeeBook.toString();
    }


}
