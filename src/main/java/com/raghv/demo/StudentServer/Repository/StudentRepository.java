package com.raghv.demo.StudentServer.Repository;


import com.raghv.demo.StudentServer.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends  JpaRepository<Student,Integer> {

//   public Student save(Student student){
//       System.out.println("Student saved in Database");
//       return  student;
//   }

}
