package com.example.ayei.demo_delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ayei.demo_delivery.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{



}
