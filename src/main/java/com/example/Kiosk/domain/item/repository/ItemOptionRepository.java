package com.example.Kiosk.domain.item.repository;

import com.example.Kiosk.domain.item.entity.ItemOption;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemOptionRepository extends JpaRepository<ItemOption, Long> {
}
