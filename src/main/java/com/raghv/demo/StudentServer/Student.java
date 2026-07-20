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
    int id;
    int age;
    String name,dept;

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
