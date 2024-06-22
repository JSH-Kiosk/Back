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
    public ResponseEntity<User> readUserByName(@PathVariable("username") String username) {
        User user = userService.findByUsername(username);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody String username) {

        System.out.println(username);

        User user = userService.save(username);

        return ResponseEntity.ok(user);
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
