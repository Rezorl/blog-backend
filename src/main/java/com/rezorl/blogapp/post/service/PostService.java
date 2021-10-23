package com.rezorl.blogapp.post.service;

import com.rezorl.blogapp.post.exception.PostNotFoundException;
import com.rezorl.blogapp.post.facade.PostFacade;
import com.rezorl.blogapp.post.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostFacade postFacade;

    public Post findById(Long id) throws PostNotFoundException {
        return this.postFacade.findById(id).orElseThrow(() -> new PostNotFoundException(id));
    }

    public Post createPost(Post post) {
        return this.postFacade.addPost(post);
    }
}
