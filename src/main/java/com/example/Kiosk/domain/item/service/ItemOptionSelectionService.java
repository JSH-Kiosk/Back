package com.example.Kiosk.domain.item.service;

import com.example.Kiosk.domain.item.repository.ItemOptionSelectionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ItemOptionSelectionService {

    private final ItemOptionSelectionRepository itemOptionSelectionRepository;

    public ItemOptionSelectionService(ItemOptionSelectionRepository itemOptionSelectionRepository) {
        this.itemOptionSelectionRepository = itemOptionSelectionRepository;
    }
}
