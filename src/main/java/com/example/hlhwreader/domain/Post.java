package com.example.hlhwreader.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "postId")
@Getter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    private Integer userId;
    private String content;
}
