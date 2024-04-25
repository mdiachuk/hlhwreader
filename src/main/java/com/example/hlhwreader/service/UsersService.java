package com.example.hlhwreader.service;

import com.example.hlhwreader.dto.UserDto;
import com.example.hlhwreader.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<UserDto> getUsers(Optional<String> query) {

        return usersRepository.findByUsernameContaining(query).stream()
                .map(user -> new UserDto(user.getUserId(), user.getUsername()))
                .toList();
    }
}
