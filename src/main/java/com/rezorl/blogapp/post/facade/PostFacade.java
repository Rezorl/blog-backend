package com.rezorl.blogapp.post.facade;

import com.rezorl.blogapp.post.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostFacade {
    Optional<Post> findById(Long id);
    Post addPost(Post post);
    List<Post> findAll();
    void remove(Long id);
}
