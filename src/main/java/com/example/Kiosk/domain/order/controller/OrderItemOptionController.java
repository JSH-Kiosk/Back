package com.example.Kiosk.domain.order.controller;

import com.example.Kiosk.domain.order.service.OrderItemOptionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-item-options")
public class OrderItemOptionController {

    private final OrderItemOptionService orderItemOptionService;

    public OrderItemOptionController(OrderItemOptionService orderItemOptionService) {
        this.orderItemOptionService = orderItemOptionService;
    }
}
