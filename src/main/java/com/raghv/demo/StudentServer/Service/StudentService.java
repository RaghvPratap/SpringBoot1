package com.raghv.demo.StudentServer.Service;

import com.raghv.demo.StudentServer.Student;
import com.raghv.demo.StudentServer.Repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository=studentRepository;
    }

    public Student studentValidate(Student student){

        int id= student.getId();
        int age=student.getAge();
        String name=student.getName();
        String dept=student.getDept();

        if(id<0 || name==null || age<0 || dept==null) return null;
        studentRepository.save(student);
        return student;
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }
}
