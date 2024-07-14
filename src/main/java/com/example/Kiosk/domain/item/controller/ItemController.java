package com.example.Kiosk.domain.item.controller;

import com.example.Kiosk.domain.item.dto.ItemAllSearchRes;
import com.example.Kiosk.domain.item.dto.ItemSearchRes;
import com.example.Kiosk.domain.item.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping()
    public ResponseEntity<ItemAllSearchRes> getItemAllSearch() {
        return ResponseEntity.ok(new ItemAllSearchRes(new ArrayList<>()));
    }

    @GetMapping("/{itemId}")
    public ResponseEntity<ItemSearchRes> getItemSearch(@PathVariable("itemId") Long itemId) {
        return ResponseEntity.ok(new ItemSearchRes(0L, "name", "description", 0L, new ArrayList<>()));
    }


}
