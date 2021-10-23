package com.rezorl.blogapp.post.mapper;

import com.rezorl.blogapp.post.dto.CreatePostRequest;
import com.rezorl.blogapp.post.dto.PostDto;
import com.rezorl.blogapp.post.entity.PostEntity;
import com.rezorl.blogapp.post.model.Post;
import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {
    PostDto toDto(Post post);
    Post toPost(CreatePostRequest request);
    Post toPost(PostEntity entity);
    PostEntity toEntity(Post post);
}
