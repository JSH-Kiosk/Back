package com.example.Kiosk.order_item.entity;

import com.example.Kiosk.item.entity.Item;
import com.example.Kiosk.order.entity.Order;
import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "order_item_id")
    private Long id;

    @Column(nullable = false)
    @ManyToOne(fetch = LAZY)
    private Order order;

    @Column(nullable = false)
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
