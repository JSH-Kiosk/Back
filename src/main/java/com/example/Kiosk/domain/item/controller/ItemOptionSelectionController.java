package com.example.Kiosk.domain.item.controller;

import com.example.Kiosk.domain.item.service.ItemOptionSelectionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item-option-selections")
public class ItemOptionSelectionController {

    private final ItemOptionSelectionService itemOptionSelectionService;

    public ItemOptionSelectionController(ItemOptionSelectionService itemOptionSelectionService) {
        this.itemOptionSelectionService = itemOptionSelectionService;
    }
}
