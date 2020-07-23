package ru.job4j.forum.store;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.job4j.forum.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
