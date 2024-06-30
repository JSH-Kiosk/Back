package com.example.Kiosk.item.repository;

import com.example.Kiosk.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
