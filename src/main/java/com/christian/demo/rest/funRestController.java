package com.christian.demo.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {
    // expose "/" that reutrns Hello world

    @GetMapping("/")
    public String sayHello(){
        return "Hello World! Time on server is "+ LocalDateTime.now();
    }

    @GetMapping("/check")
    public String check(){return "ITS IN THE BAG";}

    @GetMapping("/fortune")
    public String fortune(){return "MIC CHECK ONE TWO ONE TWO";}
}
