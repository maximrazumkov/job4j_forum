package ru.job4j.forum.services;

import org.springframework.stereotype.Service;
import ru.job4j.forum.models.Post;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>();
    private final AtomicInteger idx = new AtomicInteger(0);

    public PostService() {
        posts.add(Post.of("Продаю машину ладу 01."));
    }

    public List<Post> getAll() {
        return posts;
    }

    public void create(Post post) {
        post.setId(idx.incrementAndGet());
        post.setCreated(Calendar.getInstance());
        posts.add(post);
    }
}
