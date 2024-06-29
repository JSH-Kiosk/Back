package com.example.Kiosk.store.repository;

import com.example.Kiosk.store.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
