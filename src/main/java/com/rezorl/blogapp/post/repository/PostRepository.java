package com.rezorl.blogapp.post.repository;

import com.rezorl.blogapp.post.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
