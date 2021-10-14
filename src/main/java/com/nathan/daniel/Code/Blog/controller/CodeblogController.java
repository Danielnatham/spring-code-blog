package com.nathan.daniel.Code.Blog.controller;

import com.nathan.daniel.Code.Blog.model.Post;
import com.nathan.daniel.Code.Blog.service.CodeblogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Slf4j
@Controller
public class CodeblogController {

    @Autowired
    CodeblogService codeblogService;

    @GetMapping(value = {"/", "posts"})
    public ModelAndView getPosts() {

        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = codeblogService.findAll();

        Collections.reverse(posts);

        mv.addObject("posts", posts);

        return mv;
    }

    @GetMapping("/posts/{id}")
    public ModelAndView getPostDetails(@PathVariable("id") Long id) {

        ModelAndView mv = new ModelAndView("postDetails");

        Post post = codeblogService.findById(id);

        mv.addObject("post", post);

        return mv;
    }

    @GetMapping("/newpost")
    public ModelAndView getPostForm() {

        ModelAndView mv = new ModelAndView("postForm");
        mv.addObject("post", new Post());

        return mv;
    }

    @PostMapping("/newpost")
    public ModelAndView savePost(@Valid Post post, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if(bindingResult.hasErrors()){

            log.error("Errors {}", bindingResult.getErrorCount());
            log.error("Post {}", post.toString());

            return new ModelAndView("postForm");

        }

        post.setCreation(LocalDate.now());

        codeblogService.save(post);

        return new ModelAndView("redirect:/posts");
    }

    @PostMapping("/deletepost/{id}")
    public String deletePost(@PathVariable("id") Long id){

        codeblogService.deleteById(id);

        return "redirect:/posts";
    }



}
