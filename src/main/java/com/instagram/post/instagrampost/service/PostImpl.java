package com.instagram.post.instagrampost.service;

import com.instagram.post.instagrampost.Dao.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostImpl implements PostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public Post doPost(Post post,int userId) {
        post.setPoster(userId);
        return postRepository.save(post);
    }

    @Override
    public int doLike(int postId) {
        Post post  = postRepository.findById(postId);
        int count  = post.getLikes();
        return count+1;
    }

    @Override
    public boolean deletePost(int postId,int userId) {

        boolean postDeleted = false;
        Post post = postRepository.findById(postId);
        int poster = post.getPoster();

        if(poster == userId){
            postRepository.deleteById(postId);
            postDeleted = true;
        }else{
            postDeleted = false;
        }

        return postDeleted;
    }

    @Override
    public List<Post> posts(int userId) {
        List<Post> post = new List<Post>();
        List<Post> resultPost = new List<Post>();

         post =  postRepository.findAll();

         post.forEach((post) =>{
             if(post.poster == userId){
                 resultPost.add(post);
             }
         });

        return resultPost;
    }
}
