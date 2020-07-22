package ru.job4j.forum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
        posts.create(post);
        return "redirect:/index";
    }

    @GetMapping("/edit")
    public String edit() {
        return "edit";
    }
}
