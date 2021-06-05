package com.mindtwig.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevToolController {
	
	@GetMapping("/")
    public String sayHello()  {
        return "Demo Dev Tools";
    }
}
