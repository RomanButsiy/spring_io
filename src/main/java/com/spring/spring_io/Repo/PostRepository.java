package com.spring.spring_io.Repo;

import com.spring.spring_io.Models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
