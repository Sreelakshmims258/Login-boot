package com.SpringbootController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "login"; // Return the name of the HTML template (index.html in this case)
    }

    @GetMapping("/features")
    public String features() {
        return "features"; // Return the name of the HTML template (features.html in this case)
    }

    @GetMapping("/pricing")
    public String pricing() {
        return "pricing"; 
    }
}

