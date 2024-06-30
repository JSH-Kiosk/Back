package com.example.Kiosk.item_option.service;

import com.example.Kiosk.item_option.repository.ItemOptionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ItemOptionService {

    private final ItemOptionRepository itemOptionRepository;

    public ItemOptionService(ItemOptionRepository itemOptionRepository) {
        this.itemOptionRepository = itemOptionRepository;
    }
}
