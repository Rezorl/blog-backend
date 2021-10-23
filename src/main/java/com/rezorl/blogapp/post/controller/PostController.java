package com.rezorl.blogapp.post.controller;

import com.rezorl.blogapp.post.dto.CreatePostRequest;
import com.rezorl.blogapp.post.dto.PostDto;
import com.rezorl.blogapp.post.exception.PostNotFoundException;
import com.rezorl.blogapp.post.mapper.PostMapper;
import com.rezorl.blogapp.post.service.PostService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    private final PostMapper postMapper;

    @GetMapping("/{id}")
    public PostDto findById(@PathVariable Long id) throws PostNotFoundException {
        return this.postMapper.toDto(this.postService.findById(id));
    }

    @PostMapping()
    public PostDto createPost(@RequestBody CreatePostRequest request) {
        return this.postMapper.toDto(this.postService.createPost(this.postMapper.toPost(request)));
    }
}
