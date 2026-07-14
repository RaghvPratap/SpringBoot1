package com.raghv.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {
    @GetMapping("/MySelf")
    public String Myself(){
        return """
                <h1> MySelf</h1>
                <p>I am Raghvendra and  I am a Software Developer</p>
                <ul>
                <li>I am M.Tech student</li>
                <li>I study in LPU</li>
                <li>I am from Lukcnow</li>
                </ul>
                """;
    }



}
