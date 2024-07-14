package com.example.Kiosk.domain.item.service;

import com.example.Kiosk.domain.item.repository.ItemOptionCategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ItemOptionCategoryService {

    private final ItemOptionCategoryRepository itemOptionCategoryRepository;

    public ItemOptionCategoryService(ItemOptionCategoryRepository itemOptionCategoryRepository) {
        this.itemOptionCategoryRepository = itemOptionCategoryRepository;
    }
}
