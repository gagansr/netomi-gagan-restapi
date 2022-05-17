package com.instagram.post.instagrampost.service;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostService  {
    Post doPost(Post post,int userId);
    int doLike(int postId);
    boolean deletePost(int postId,int userId);
    List<Post> posts(int userId);
}
