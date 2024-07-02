package com.example.Kiosk.domain.order.service;

import com.example.Kiosk.domain.order.repository.OrderItemOptionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class OrderItemOptionService {

    private final OrderItemOptionRepository orderItemRepository;

    public OrderItemOptionService(OrderItemOptionRepository orderItemOptionRepository) {
        this.orderItemRepository = orderItemOptionRepository;
    }
}
