package com.spring.spring_io.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalleryController {

    @GetMapping("/gallery")
    public String gallery(Model model) {
        model.addAttribute("title", "Галерея");
        return "gallery";
    }

}
