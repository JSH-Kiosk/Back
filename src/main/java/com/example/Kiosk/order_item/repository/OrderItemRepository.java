package com.example.Kiosk.order_item.repository;

import com.example.Kiosk.order_item.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
