package com.example.Kiosk.domain.order.entity;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "order_item_option_selections")
public class OrderItemOptionSelection {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "order_item_option_selection_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    private OrderItemOptionCategory orderItemOptionCategory;

    @Column(nullable = false, length = 255)
    private String selectionName;

    @Column(nullable = false, length = 255)
    private String imageUrl;

    public OrderItemOptionSelection() {
    }

    public OrderItemOptionSelection(Long id, OrderItemOptionCategory orderItemOptionCategory, String selectionName, String imageUrl) {
        this.id = id;
        this.orderItemOptionCategory = orderItemOptionCategory;
        this.selectionName = selectionName;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public OrderItemOptionCategory getOrderItemOptionCategory() {
        return orderItemOptionCategory;
    }

    public String getSelectionName() {
        return selectionName;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
