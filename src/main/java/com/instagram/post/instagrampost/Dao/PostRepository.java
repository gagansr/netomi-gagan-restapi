package com.instagram.post.instagrampost.Dao;

import com.instagram.post.instagrampost.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public abstract class PostRepository implements JpaRepository<Post, Integer> {
}
