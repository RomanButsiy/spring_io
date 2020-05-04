package com.spring.spring_io.Repo;

import com.spring.spring_io.Models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findAllByOrderByIdDesc();
}
