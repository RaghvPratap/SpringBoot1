package com.raghv.demo.StudentServer;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
   public Student save(Student student){
       System.out.println("Student saved in Database");
       return  student;
   }
}
