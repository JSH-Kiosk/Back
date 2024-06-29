package com.example.Kiosk.user.repository;

import com.example.Kiosk.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
