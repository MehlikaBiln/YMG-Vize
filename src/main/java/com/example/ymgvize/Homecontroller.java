package com.example.ymgvize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class Homecontroller {
    @RequestMapping(value = {"/", "/home"})
    public String  getHomePage(){
        return "makale";
    }

}
