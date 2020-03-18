package com.spring.spring_io.Repo;

import com.spring.spring_io.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
