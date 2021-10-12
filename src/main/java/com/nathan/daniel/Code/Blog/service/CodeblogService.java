package com.nathan.daniel.Code.Blog.service;

import com.nathan.daniel.Code.Blog.model.Post;

import java.util.List;

public interface CodeblogService  {

    List<Post> findAll();
    Post findById (Long id);
    Post save (Post post);

}
