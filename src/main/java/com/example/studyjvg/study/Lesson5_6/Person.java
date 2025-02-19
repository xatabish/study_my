package com.example.studyjvg.study.Lesson5_6;



public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }

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

    public int getSalary() {
        return salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    private String name;
    private String lastname;
    private int salary;
    private int departmentId;


}
