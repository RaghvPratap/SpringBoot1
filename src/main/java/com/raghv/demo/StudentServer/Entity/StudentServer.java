package com.raghv.demo.StudentServer.Entity;

import com.raghv.demo.StudentServer.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {
    //1.Store the student

    @PostMapping("/create")
    public String storeStudent(@RequestBody Student student){
        int id= student.getId();
        int age=student.getAge();
        String name=student.getName();
        String dept=student.getDept();
        return "id:"+id+"age:"+age+"name:"+name+"dept:"+dept;
    }

    //2.Retrieve the student
    //3.Update the student
    //4.Delete the student
}
