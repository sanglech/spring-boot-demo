package com.christian.demo.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    //inject properties

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    // expose "/" that reutrns Hello world
    @GetMapping("/")
    public String sayHello(){
        return "Hello World! Time on server is "+ LocalDateTime.now();
    }

    @GetMapping("/check")
    public String check(){return "ITS IN THE BAG";}

    @GetMapping("/fortune")
    public String fortune(){return "MIC CHECK ONE TWO ONE TWO";}

    @GetMapping("/teaminfo")
    public String teamInfo(){return "Coach: "+ coachName+ " "+ "TeamName: "+teamName;}
}
