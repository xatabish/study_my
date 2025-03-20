package com.example.studyjvg.study.Lesson5_6;


import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class EmployeeStreamService {

    List<Person> employeeBook = List.of(
            new Person("Муратов", "Айадил", 95000, 1),
            new Person("Муратова", "Дарига", 92000, 2),
            new Person("Мухитов", "Жандос", 98000, 3),
            new Person("Булавка", "Дмитрий", 90000, 2),
            new Person("Кайтанов", "Жасулан", 99000, 3),
            new Person("Бейсенбек", "Ильяс", 93000, 1));

    public Person maxSalary(int id) {
        return employeeBook.stream()
                .filter(person -> person.getDepartmentId() == id)
                .max(Comparator.comparing(Person::getSalary))
                .orElseThrow(() -> new RuntimeException("Сотрудник не найден"));
    }

    public Person minSalary(int id) {
        return employeeBook.stream()
                .filter(e -> e.getDepartmentId() == id)
                .min(Comparator.comparing(Person::getSalary))
                .orElseThrow(() -> new RuntimeException("сотрудник не найден"));

    }

    public List<Person> EmployeeInDepartmentId(int id) {
        return employeeBook.stream()
                .filter(e -> e.getDepartmentId() == id)
                .toList();
    }

    public List<Person> getAllEmployee() {
        return employeeBook;
    }

    public Integer sumSal(int id) {
        return employeeBook.stream()
                .filter(e -> e.getDepartmentId() == id)
                .mapToInt(Person::getSalary)
                .sum();
    }


}
