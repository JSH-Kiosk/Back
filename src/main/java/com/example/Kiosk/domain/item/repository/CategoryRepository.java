package com.example.Kiosk.domain.item.repository;

import com.example.Kiosk.domain.item.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
