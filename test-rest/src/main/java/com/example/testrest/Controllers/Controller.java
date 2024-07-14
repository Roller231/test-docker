package com.example.testrest.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class Controller {

    @Value("${spring.application.hello}")
    private String text;

    @GetMapping
    public String HelloWorld(){
            return text;
    }
}
