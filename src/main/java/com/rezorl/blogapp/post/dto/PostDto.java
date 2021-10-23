package com.rezorl.blogapp.post.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto {
    private Long id;
    private String title;
    private String description;
}
