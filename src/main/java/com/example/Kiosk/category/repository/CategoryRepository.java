package com.example.Kiosk.category.repository;

import com.example.Kiosk.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
