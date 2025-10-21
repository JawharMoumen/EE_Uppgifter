package com.example.EE_Uppgifter_Lektion_1_Java_Enterprise.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homePage() {

        return "home";
    }
}
