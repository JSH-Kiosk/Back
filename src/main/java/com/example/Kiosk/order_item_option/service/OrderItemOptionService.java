package com.example.Kiosk.order_item_option.service;

import com.example.Kiosk.order_item.repository.OrderItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class OrderItemOptionService {

    private final OrderItemRepository orderItemRepository;

    public OrderItemOptionService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

}
