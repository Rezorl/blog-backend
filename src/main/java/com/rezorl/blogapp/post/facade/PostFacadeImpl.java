package com.rezorl.blogapp.post.facade;

import com.rezorl.blogapp.post.mapper.PostMapper;
import com.rezorl.blogapp.post.model.Post;
import com.rezorl.blogapp.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PostFacadeImpl implements PostFacade {
    private final PostRepository postRepository;
    public final PostMapper postMapper;

    @Override
    public Optional<Post> findById(Long id) {
        return this.postRepository.findById(id).map(this.postMapper::toPost);
    }

    @Override
    public Post addPost(Post post) {
        return this.postMapper.toPost(this.postRepository.save(this.postMapper.toEntity(post)));
    }
}
