package com.example.Kiosk.domain.order.entity;

import com.example.Kiosk.domain.item.entity.Item;
import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Order order;

    @ManyToOne(fetch = LAZY)
    private Item item;

    @Column(nullable = false)
    private Long count;

    public OrderItem() {
    }

    public OrderItem(Long id, Order order, Item item, Long count) {
        this.id = id;
        this.order = order;
        this.item = item;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public Item getItem() {
        return item;
    }

    public Long getCount() {
        return count;
    }
}
