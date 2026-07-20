package com.raghv.demo.StudentServer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    public Student(){

    };
    public Student(int id, int age, String name, String dept) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.dept = dept;
    }

    @Id
    @Positive(message = "Id must be greater than 0")
    int id;

    @Min(value = 18, message = "Age must be at least 18")
    @Max(value = 60, message = "Age cannot exceed 60")
    int age;

    @NotBlank(message = "Name cannot be empty")
    @Size(min = 3, max = 30, message = "Name must be between 3 and 30 characters")
    String name;

    @NotBlank(message = "Department cannot be empty")
    String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
