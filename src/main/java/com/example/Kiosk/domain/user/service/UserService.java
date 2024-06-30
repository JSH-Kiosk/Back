package com.example.Kiosk.domain.user.service;

import com.example.Kiosk.domain.user.entity.User;
import com.example.Kiosk.domain.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
