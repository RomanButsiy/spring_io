package com.spring.spring_io.Controllers;

import com.spring.spring_io.Models.Post;
import com.spring.spring_io.Repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.util.Date;

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

    @GetMapping("/blog/add")
    public String blogAdd(Model model) {
        model.addAttribute("title", "Додати нову статтю");
        return "blog-add";
    }

    @PostMapping("/blog/add")
    public String blogPostAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String img, @RequestParam String full_text, Model model) {
        Post post = new Post(title, anons, full_text, img);
        Date date= new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        post.setCts(timestamp);
        post.setMts(timestamp);
        postRepository.save(post);
        return "redirect:/blog";
    }

}
