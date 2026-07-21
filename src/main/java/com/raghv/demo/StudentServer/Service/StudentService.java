package com.raghv.demo.StudentServer.Service;

import com.raghv.demo.StudentServer.Student;
import com.raghv.demo.StudentServer.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    public Student getStudentById(int id) throws  Exception {
        Optional<Student> student=studentRepository.findById(id);
//        return studentRepository.findById(id).orElse(null);
        return  student.get();
    }

    public Student updateStudent(int id, Student newStudent) {
        System.out.println("Searching for ID: " + id);
        Optional<Student> optionalStudent=studentRepository.findById(id);
        System.out.println("Found? " + optionalStudent.isPresent());
        if(optionalStudent.isEmpty()){
            return null;
        }
        Student existingStudent=optionalStudent.get();
        existingStudent.setName(newStudent.getName());
        existingStudent.setAge(newStudent.getAge());
        existingStudent.setDept(newStudent.getDept());

        return studentRepository.save(existingStudent);
    }

    public boolean deleteStudent(int id) {

        Optional<Student> student = studentRepository.findById(id);

        if (student.isEmpty()) {
            return false;
        }

        studentRepository.delete(student.get());

        return true;
    }
}
