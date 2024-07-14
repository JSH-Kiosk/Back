package com.example.Kiosk.domain.order.entity;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "order_item_option_categories")
public class OrderItemOptionCategory {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "order_item_option_category_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    private OrderItem orderItem;

    @Column(nullable = false, length = 20)
    private String optionName;

    public OrderItemOptionCategory() {
    }

    public OrderItemOptionCategory(Long id, OrderItem orderItem, String optionName) {
        this.id = id;
        this.orderItem = orderItem;
        this.optionName = optionName;
    }

    public Long getId() {
        return id;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public String getOptionName() {
        return optionName;
    }
}
