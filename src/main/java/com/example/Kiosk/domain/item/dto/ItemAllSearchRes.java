package com.example.Kiosk.domain.item.dto;

import java.util.List;

public record ItemAllSearchRes(List<Category> categories) {

}

record Category(String name, Long prority, List<Item> items) {
}

record Item(Long id, String imageUrl, String name, Long price) {
}