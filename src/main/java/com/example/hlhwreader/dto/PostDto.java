package com.example.hlhwreader.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class PostDto {

    @JsonProperty("post_id")
    int postId;
    String content;
}
