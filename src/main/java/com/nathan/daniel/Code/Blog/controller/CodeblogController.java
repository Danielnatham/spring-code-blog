package com.nathan.daniel.Code.Blog.controller;

import com.nathan.daniel.Code.Blog.model.Post;
import com.nathan.daniel.Code.Blog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CodeblogController {

    @Autowired
    CodeblogService codeblogService;

    @GetMapping("/posts")
    public ModelAndView getPosts(){

        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = codeblogService.findAll();

        mv.addObject("posts",posts);

        return mv;
    }

}
