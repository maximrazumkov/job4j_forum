package ru.job4j.forum.store;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.job4j.forum.models.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {

    Authority findByAuthority(String authority);
}
