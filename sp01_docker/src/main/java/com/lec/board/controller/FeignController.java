package com.lec.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lec.board.fegin.JsonPlaceholderClient;
import com.lec.board.fegin.Post;

// @RestController
public class FeignController {
/*
    private final JsonPlaceholderClient jsonPlaceholderClient;

    public FeignController(JsonPlaceholderClient jsonPlaceholderClient) {
        this.jsonPlaceholderClient = jsonPlaceholderClient;
    }

    @GetMapping("/feign/posts/{id}")
    public Post getPostById(@PathVariable Long id) {
        System.out.println("yaz biseyler");
        return jsonPlaceholderClient.getPostById(id);
    }

    @GetMapping("/feign/posts")
    public List<Post> getAllPosts() {
    	System.out.println("...................................................");
        return jsonPlaceholderClient.getPosts();
    }
*/   
}
