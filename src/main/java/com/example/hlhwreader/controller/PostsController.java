package com.example.hlhwreader.controller;

import com.example.hlhwreader.dto.PostDto;
import com.example.hlhwreader.service.PostsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    private PostsService postsService;

    @GetMapping
    public ResponseEntity<List<PostDto>> getPosts(
            @RequestParam("user_id") int userId,
            @RequestParam int limit,
            @RequestParam int offset
    ) {

        var responseBody = postsService.getPosts(userId, limit, offset);

        return ResponseEntity.ok(responseBody);
    }

}
