package com.example.Kiosk.domain.order.controller;

import com.example.Kiosk.domain.order.service.OrderItemOptionCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-item-option-categories")
public class OrderItemOptionCategoryController {

    private final OrderItemOptionCategoryService orderItemOptionCategoryService;

    public OrderItemOptionCategoryController(OrderItemOptionCategoryService orderItemOptionCategoryService) {
        this.orderItemOptionCategoryService = orderItemOptionCategoryService;
    }
}
