package com.example.Kiosk.item_option.controller;

import com.example.Kiosk.item_option.service.ItemOptionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item-options")
public class ItemOptionController {

    private final ItemOptionService itemOptionService;

    public ItemOptionController(ItemOptionService itemOptionService) {
        this.itemOptionService = itemOptionService;
    }

}
