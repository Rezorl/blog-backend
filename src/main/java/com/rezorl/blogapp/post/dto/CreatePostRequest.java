package com.rezorl.blogapp.post.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Valid
public class CreatePostRequest {
    @NotBlank
    private String title;
    @NotBlank
    private String description;
}
