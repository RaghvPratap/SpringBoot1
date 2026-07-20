package com.raghv.demo.Scope;

import com.raghv.demo.StudentServer.Student;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LPU {
    LPU(){
        System.out.println("LPU Phagwara Punjab");
    }
    public void adm(Student student){
        System.out.println("Admission");
    }
    public void exam(){
        System.out.println("Exam");
    }
    public void pep(){
        System.out.println("Pep class");
    }
}
