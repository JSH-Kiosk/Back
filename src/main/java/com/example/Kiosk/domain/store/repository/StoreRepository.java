package com.example.Kiosk.domain.store.repository;

import com.example.Kiosk.domain.store.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
