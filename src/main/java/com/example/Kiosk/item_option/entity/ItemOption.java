package com.example.Kiosk.item_option.entity;

import com.example.Kiosk.item.entity.Item;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "item_options")
@EntityListeners(AuditingEntityListener.class)
public class ItemOption {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "item_option_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Item item;

    private String name;

    private String description;

    private String imageUrl;

    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public ItemOption() {
    }

    public ItemOption(Long id, Item item, String name, String description, String imageUrl, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.item = item;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public Item getItem() {
        return item;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
