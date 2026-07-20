package com.raghv.demo.StudentServer.Controller;

import com.raghv.demo.StudentServer.Service.StudentService;
import com.raghv.demo.StudentServer.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "http://localhost:5173")
@RestController
//Responsible for hearing the incoming HTTP requests
public class StudentController {
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> storeStudent(@RequestBody @Valid Student student){
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

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id,@Valid
                                                 @RequestBody Student student){
        Student updateStudent=studentService.updateStudent(id, student);
        System.out.println("PUT API called");
        if(updateStudent==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updateStudent);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {

        System.out.println("DELETE API called");

        boolean deleted = studentService.deleteStudent(id);

        if (!deleted) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.ok("Student deleted successfully");
    }

}
