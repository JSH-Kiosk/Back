package com.example.Kiosk.user.controller;

import com.example.Kiosk.user.entity.User;
import com.example.Kiosk.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> readUser() {
        return ResponseEntity.ok(userService.findUsers());
    }

    @GetMapping("/{username}")
    public ResponseEntity readUserByName(@PathVariable("username") String username) {
        return ResponseEntity.ok("ok");
    }

    @PatchMapping
    public ResponseEntity updateUser() {
        return ResponseEntity.ok("patch user");
    }

    @DeleteMapping
    public ResponseEntity deleteUser() {
        return ResponseEntity.ok("delete user");
    }

}
