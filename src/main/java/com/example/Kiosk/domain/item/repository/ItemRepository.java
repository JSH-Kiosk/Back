package com.example.Kiosk.domain.item.repository;

import com.example.Kiosk.domain.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
