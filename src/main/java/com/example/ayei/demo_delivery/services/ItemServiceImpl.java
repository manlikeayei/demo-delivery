package com.example.ayei.demo_delivery.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.ayei.demo_delivery.entities.Item;
import com.example.ayei.demo_delivery.repository.ItemRepository;

@Component

public class ItemServiceImpl implements ItemService {


    private final ItemRepository itemRepository;
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item createItem(Item item) {
        
        return itemRepository.save(item);
    }

    @Override
    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
        
    }

    @Override
    public List<Item> getAllItems() {
        
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(Long id) {
        
        return itemRepository.findById(id).get();
    }
    

}
