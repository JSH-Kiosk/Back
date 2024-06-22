package com.example.Kiosk.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity readUser() {
        return ResponseEntity.ok("get user");
    }

    @PostMapping
    public ResponseEntity createUser() {
        return ResponseEntity.ok("post user");
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
