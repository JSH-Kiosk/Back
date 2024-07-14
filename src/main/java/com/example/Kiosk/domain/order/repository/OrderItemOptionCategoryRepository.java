package com.example.Kiosk.domain.order.repository;

import com.example.Kiosk.domain.order.entity.OrderItemOptionCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemOptionCategoryRepository extends JpaRepository<OrderItemOptionCategory, Long> {
}
