package com.example.Kiosk.domain.order.repository;

import com.example.Kiosk.domain.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
