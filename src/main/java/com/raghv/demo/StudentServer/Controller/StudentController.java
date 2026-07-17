package com.raghv.demo.StudentServer.Controller;

import com.raghv.demo.StudentServer.Service.StudentService;
import com.raghv.demo.StudentServer.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//Responsible for hearing the incoming HTTP requests
public class StudentController {
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> storeStudent(@RequestBody Student student){
        Student res=studentService.studentValidate(student);
        if(res==null){
            return ResponseEntity.status(400).body(res);
        }
        return ResponseEntity.status(201).body(res);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id) {
        Student student = studentService.getStudentById(id);
        return ResponseEntity.status(200).body(student);
    }

}
