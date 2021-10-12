package com.nathan.daniel.Code.Blog.repository;

import com.nathan.daniel.Code.Blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {
}
