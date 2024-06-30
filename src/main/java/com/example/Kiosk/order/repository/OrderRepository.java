package com.example.Kiosk.order.repository;

import com.example.Kiosk.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
