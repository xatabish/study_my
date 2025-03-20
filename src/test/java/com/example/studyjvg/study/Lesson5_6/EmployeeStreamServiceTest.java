package com.example.studyjvg.study.Lesson5_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.*;


class EmployeeStreamServiceTest {


    private final  EmployeeStreamService employeeStreamService = new  EmployeeStreamService();

    @Test
    void maxSalary() {
        var actual = employeeStreamService.maxSalary(1);
        var expected = new Person("Муратов", "Айадил", 95000, 1);
        assertEquals(expected, actual);
    }

    @Test
    void minSalary() {
    }

    @Test
    void employeeInDepartmentId() {
    }

    @Test
    void sumSal() {
    }
}