package com.example.Kiosk.domain.item.controller;

import com.example.Kiosk.domain.item.service.ItemOptionCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item-option-categories")
public class ItemOptionCategoryController {

    private final ItemOptionCategoryService itemOptionCategoryService;

    public ItemOptionCategoryController(ItemOptionCategoryService itemOptionCategoryService) {
        this.itemOptionCategoryService = itemOptionCategoryService;
    }
}
