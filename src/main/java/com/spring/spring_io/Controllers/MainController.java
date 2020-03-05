package com.spring.spring_io.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Головна сторінка");
        return "home";
    }

    @GetMapping("/blog")
    public String blog(Model model) {
        model.addAttribute("title", "Блог");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Про нас");
        return "home";
    }

}
