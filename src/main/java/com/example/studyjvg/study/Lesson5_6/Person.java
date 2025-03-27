package com.example.studyjvg.study.Lesson5_6;


import java.util.Objects;

public class Person {

    private final String name;
    private final String lastname;
    private final int salary;
    private final  int departmentId;

    public Person(String name, String lastname, int salary, int departmentId) {
        this.name = name;
        this.lastname = lastname;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return salary == person.salary && departmentId == person.departmentId && Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, salary, departmentId);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }

}
