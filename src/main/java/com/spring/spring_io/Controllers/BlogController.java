package com.spring.spring_io.Controllers;

import com.spring.spring_io.Models.Post;
import com.spring.spring_io.Repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("title", "Блог");
        model.addAttribute("posts", posts);
        return "blog-main";
    }

}
