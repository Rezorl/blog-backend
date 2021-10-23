package com.rezorl.blogapp.post.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private Long id;
    private String title;
    private String description;
}
