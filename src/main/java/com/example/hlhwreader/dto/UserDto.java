package com.example.hlhwreader.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class UserDto {

    @JsonProperty("user_id")
    int userId;
    String username;
}
