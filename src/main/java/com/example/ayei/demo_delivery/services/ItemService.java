package com.example.ayei.demo_delivery.services;

import java.util.List;

import com.example.ayei.demo_delivery.entities.Item;

public interface ItemService {


    Item createItem(Item item);
    Item getItemById(Long id);
    List<Item> getAllItems();
    void deleteItem(Long id);
    
} 


