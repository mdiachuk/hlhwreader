package com.example.hlhwreader.controller;

import com.example.hlhwreader.dto.UserDto;
import com.example.hlhwreader.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/search")
    public ResponseEntity<List<UserDto>> getPosts(@RequestParam Optional<String> query) {

        var responseBody = usersService.getUsers(query);

        return ResponseEntity.ok(responseBody);
    }

}
