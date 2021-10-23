package com.rezorl.blogapp.post.facade;

import com.rezorl.blogapp.post.mapper.PostMapper;
import com.rezorl.blogapp.post.model.Post;
import com.rezorl.blogapp.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    @Override
    public List<Post> findAll() {
        return this.postRepository.findAll().stream().map(this.postMapper::toPost).collect(Collectors.toList());
    }

    @Override
    public void remove(Long id) {
        this.postRepository.deleteById(id);
    }
}
