package com.example.Kiosk.domain.item.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "item_option_selections")
@EntityListeners(AuditingEntityListener.class)
public class ItemOptionSelection {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "item_option_selection_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    private ItemOptionCategory itemOptionCategory;

    @Column(nullable = false, length = 255)
    private String selectionName;

    @Column(nullable = false, length = 255)
    private String imageUrl;

    public ItemOptionSelection() {
    }

    public ItemOptionSelection(Long id, ItemOptionCategory itemOptionCategory, String selectionName, String imageUrl) {
        this.id = id;
        this.itemOptionCategory = itemOptionCategory;
        this.selectionName = selectionName;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public ItemOptionCategory getItemOptionCategory() {
        return itemOptionCategory;
    }

    public String getSelectionName() {
        return selectionName;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
