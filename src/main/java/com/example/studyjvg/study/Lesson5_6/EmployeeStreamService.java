package com.example.studyjvg.study.Lesson5_6;


import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;




@Service
public class EmployeeStreamService {

    List<Person> EmployeeBook = new ArrayList<>();
    private Optional maxMinSal;


    public Optional maxSalary(int id) {
        return maxMinSal =    EmployeeBook.stream()
                .filter(e -> e.getDepartmentId() == id)
                .map(Person :: getSalary)
                .max(Comparator.naturalOrder());
    }

    public Optional minSalary(int id) {
        return maxMinSal =    EmployeeBook.stream()
                .filter(e -> e.getDepartmentId() == id)
                .map(Person :: getSalary)
                .min(Comparator.naturalOrder());
    }

    public String EmployeeInDepartmentId (int id) {
        List<Person> employeeBookForDepartmentId = EmployeeBook.stream()
                .filter(e -> e.getDepartmentId() == id)
                .toList();


        return employeeBookForDepartmentId.toString();
    }

}
