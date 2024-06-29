package com.example.Kiosk.order_item_option.entity;

import com.example.Kiosk.order_item.entity.OrderItem;
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

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 100)
    private String description;

    public OrderItemOption() {
    }

    public OrderItemOption(Long id, OrderItem orderItem, String name, String description) {
        this.id = id;
        this.orderItem = orderItem;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
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
