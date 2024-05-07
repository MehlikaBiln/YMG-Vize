package com.example.ymgvize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}
