package com.example.Kiosk.domain.item.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "item_option_categories")
@EntityListeners(AuditingEntityListener.class)
public class ItemOptionCategory {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "item_option_category_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Item item;

    @Column(nullable = false, length = 20)
    private String optionName;

    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public ItemOptionCategory() {
    }

    public ItemOptionCategory(Long id, Item item, String optionName, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.item = item;
        this.optionName = optionName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public Item getItem() {
        return item;
    }

    public String getOptionName() {
        return optionName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
