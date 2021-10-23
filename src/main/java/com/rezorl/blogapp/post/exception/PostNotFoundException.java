package com.rezorl.blogapp.post.exception;

public class PostNotFoundException extends Exception {
    public PostNotFoundException(Long id) {
        super(String.format("Post not found id: %s", id));
    }
}
