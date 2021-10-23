package com.rezorl.blogapp.post.advice;

import com.rezorl.blogapp.post.exception.PostNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PostControllerAdvice {

    @ExceptionHandler(PostNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    private String handlePostNotFoundException(PostNotFoundException ex) {
        return ex.getMessage();
    }
}
