package com.lbg.hackathon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HackathonController {
    @GetMapping("/helloworld")
    public String getHelloWorld(){
        return "Hello World";
    }
    @GetMapping("/enddemo")
    public String getEndDemo(){
        return "End of Demo";
    }
}
