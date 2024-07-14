package com.example.Kiosk.domain.order.service;

import com.example.Kiosk.domain.order.repository.OrderItemOptionCategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class OrderItemOptionCategoryService {

    private final OrderItemOptionCategoryRepository orderItemOptionCategoryRepository;

    public OrderItemOptionCategoryService(OrderItemOptionCategoryRepository orderItemOptionCategoryRepository) {
        this.orderItemOptionCategoryRepository = orderItemOptionCategoryRepository;
    }
}
