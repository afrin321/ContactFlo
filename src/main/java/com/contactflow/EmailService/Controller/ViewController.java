package com.contactflow.EmailService.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class ViewController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
