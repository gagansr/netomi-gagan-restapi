package com.instagram.post.instagrampost.controller;

import com.instagram.post.instagrampost.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/{userID}/dopost")
    public Post doPost(@RequestBody Post post, @PathVariable int userId){
        return postService.doPost(post,userId);
    }

    @PostMapping("/doLike/{postId}")
    public int doLike(@PathVariable int postId){
        return postService.doLike(postId);
    }

    @DeleteMapping("/{userId}/deletePost/{postId}")
    public boolean deletePost(@PathVariable int postId,@PathVariable int userId){
        return postService.deletePost(postId,userId);
    }

    @GetMapping("/{userId}/allPosts")
    public List<Post> allPosts(@PathVariable int userId){
        return postService.posts(userId);
    }

}
