package com.nathan.daniel.Code.Blog.service.serviceImpl;

import com.nathan.daniel.Code.Blog.model.Post;
import com.nathan.daniel.Code.Blog.repository.CodeblogRepository;
import com.nathan.daniel.Code.Blog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {

    private static CodeblogRepository codeblogRepository ;

    public CodeblogServiceImpl(CodeblogRepository codeblogRepository) {
        this.codeblogRepository = codeblogRepository;
    }

    @Override
    public List<Post> findAll() {
        return codeblogRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return codeblogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return codeblogRepository.save(post);
    }
}
