package com.raghv.demo.StudentServer.DTO;

public class requestStudentDTO {
    private String name;
    private int age;
    private String dept;

    public requestStudentDTO(){

    }
    public requestStudentDTO(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
