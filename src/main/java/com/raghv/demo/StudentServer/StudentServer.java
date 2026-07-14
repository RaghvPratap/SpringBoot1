package com.raghv.demo.StudentServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {
    //1.Store the student
    @PostMapping("/create")
    public String storeStudent(){
        return """
                id=1,
                name:"Raghv",
                dept:"CSE",
                age:22
                """;
    }
    //2.Retrieve the student
    //3.Update the student
    //4.Delete the student
}
