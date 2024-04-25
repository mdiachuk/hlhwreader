package com.example.hlhwreader.repository;

import com.example.hlhwreader.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostsRepository extends JpaRepository<Post, Integer> {

    @Query(value = "SELECT * FROM posts WHERE user_id = :userId LIMIT :limit OFFSET :offset", nativeQuery = true)
    List<Post> findPostsByUserIdWithLimitOffset(@Param("userId") int userId, @Param("limit") int limit, @Param("offset") int offset);
}
