package com.example.Kiosk.domain.order.entity;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "order_item_options")
public class OrderItemOption {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "order_item_option_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    private OrderItem orderItem;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 255, nullable = false)
    private String description;

    public OrderItemOption() {
    }

    public OrderItemOption(Long id, OrderItem orderItem, String name, String description) {
        this.id = id;
        this.orderItem = orderItem;
        this.name = name;
        this.description = description;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
