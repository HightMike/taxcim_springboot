package ru.borisov;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping("/main")
    public String greeting() {
        return "index";
    }
}
