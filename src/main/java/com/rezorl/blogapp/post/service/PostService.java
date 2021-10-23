package com.rezorl.blogapp.post.service;

import com.rezorl.blogapp.post.exception.PostNotFoundException;
import com.rezorl.blogapp.post.facade.PostFacade;
import com.rezorl.blogapp.post.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostFacade postFacade;

    public List<Post> findAll() {
        return this.postFacade.findAll();
    }

    public Post findById(Long id) throws PostNotFoundException {
        return this.postFacade.findById(id).orElseThrow(() -> new PostNotFoundException(id));
    }

    public Post createPost(Post post) {
        return this.postFacade.addPost(post);
    }

    public Post remove(Long id) throws PostNotFoundException{
        Post post =  this.findById(id);
        this.postFacade.remove(id);
        return post;
    }
}
