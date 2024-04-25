package com.example.hlhwreader.repository;

import com.example.hlhwreader.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Integer> {

    List<User> findByUsernameContaining(String query);

    default List<User> findByUsernameContaining(Optional<String> query) {

        return query
                .map(this::findByUsernameContaining)
                .orElseGet(this::findAll);
    }
}
