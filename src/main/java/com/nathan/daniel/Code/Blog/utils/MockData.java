package com.nathan.daniel.Code.Blog.utils;

import com.nathan.daniel.Code.Blog.model.Post;
import com.nathan.daniel.Code.Blog.service.serviceImpl.CodeblogServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
@AllArgsConstructor
@NoArgsConstructor
public class MockData {

    @Autowired
    CodeblogServiceImpl codeblogService;

    //@PostConstruct
    public void savePost(){

        List<Post> postList = new ArrayList<Post>();

        Post post1 = new Post();
        post1.setAuthor("Daniel Nathan");
        post1.setCreation(LocalDate.now());
        post1.setTitle("Lorem Ipsum");
        post1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam scelerisque, metus non viverra ultrices, ligula leo fermentum massa, nec maximus elit ante at mauris. Maecenas interdum sem quis orci molestie.");

        Post post2 = new Post();
        post2.setAuthor("Jose Namucco");
        post2.setCreation(LocalDate.now());
        post2.setTitle("Lorem Ipsum");
        post2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam scelerisque, metus non viverra ultrices, ligula leo fermentum massa, nec maximus elit ante at mauris. Maecenas interdum sem quis orci molestie.");

        postList.add(post1);
        postList.add(post2);

        for (Post post: postList) {
            Post postSaved = codeblogService.save(post);
            log.info("postId - {}",postSaved.getId());
        }

    }
}
