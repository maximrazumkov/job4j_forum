package ru.job4j.forum.services;

import org.springframework.stereotype.Service;
import ru.job4j.forum.models.Post;
import ru.job4j.forum.store.PostRepository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class PostService {
    private final PostRepository posts;

    public PostService(PostRepository posts) {
        this.posts = posts;
    }

    public List<Post> getAll() {
        List<Post> rsl = new ArrayList<>();
        posts.findAll().forEach(rsl::add);
        return rsl;
    }

    public void save(Post post) {
        if (post.getId() != null) {
            Post postFromDb = posts.findById(post.getId()).get();
            post.setCreated(postFromDb.getCreated());
        }
        posts.save(post);
    }
}
