package com.example.Kiosk.domain.order.repository;

import com.example.Kiosk.domain.order.entity.OrderItemOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemOptionRepository extends JpaRepository<OrderItemOption, Long> {
}
