package com.example.hlhwreader.service;

import com.example.hlhwreader.dto.PostDto;
import com.example.hlhwreader.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    @Autowired
    private PostsRepository postsRepository;

    public List<PostDto> getPosts(int userId, int limit, int offset) {

        return postsRepository.findPostsByUserIdWithLimitOffset(userId, limit, offset).stream()
                .map(post -> new PostDto(post.getPostId(), post.getContent()))
                .toList();
    }
}
