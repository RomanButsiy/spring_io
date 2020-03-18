package com.spring.spring_io.Repo;

import com.spring.spring_io.Models.Gallery;
import org.springframework.data.repository.CrudRepository;

public interface GalleryRepository extends CrudRepository<Gallery, Long> {
}
