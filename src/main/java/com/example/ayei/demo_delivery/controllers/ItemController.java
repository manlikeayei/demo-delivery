package com.example.ayei.demo_delivery.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ayei.demo_delivery.entities.Item;
import com.example.ayei.demo_delivery.services.ItemService;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {


        private final ItemService itemService;

        public ItemController(ItemService itemService) {
            this.itemService = itemService;
        }


        @PostMapping("create-item")
        ResponseEntity<Item> createItem(@RequestBody Item item){

            Item newItem = itemService.createItem(item);
            return ResponseEntity.ok(newItem);
        }

}
