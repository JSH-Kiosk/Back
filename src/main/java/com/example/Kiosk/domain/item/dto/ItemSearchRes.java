package com.example.Kiosk.domain.item.dto;

import java.util.List;

public record ItemSearchRes(Long itemId, String name, String description, Long price, List<Option> options) { }

record Option(String name, List<Selection> selections) { }

record Selection(String name, String imageUrl) { }