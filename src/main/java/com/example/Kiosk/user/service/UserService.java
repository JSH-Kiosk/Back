package com.example.Kiosk.user.service;

import com.example.Kiosk.user.entity.User;
import com.example.Kiosk.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findUsers() {
        List<User> all = userRepository.findAll();
        System.out.println(all);
        return all;
    }

    public User findByUsername(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        return user.orElseThrow(() -> new IllegalStateException());
    }

}
