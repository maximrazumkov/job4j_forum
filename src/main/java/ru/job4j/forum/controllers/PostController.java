package ru.job4j.forum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.job4j.forum.models.Post;
import ru.job4j.forum.services.PostService;

@Controller
public class PostController {

    private final PostService posts;

    public PostController(PostService posts) {
        this.posts = posts;
    }

    @PostMapping("/post")
    public String create(@ModelAttribute Post post) {
        posts.save(post);
        return "redirect:/index";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Post post, Model model) {
        model.addAttribute("post", post);
        return "edit";
    }

    @GetMapping("/edit")
    public String edit(Model model) {
        return "edit";
    }
}
