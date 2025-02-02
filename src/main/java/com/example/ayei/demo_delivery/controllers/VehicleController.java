package com.example.ayei.demo_delivery.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ayei.demo_delivery.services.ItemService;
import com.example.ayei.demo_delivery.services.VehicleService;

import entities.Vehicle;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/vehicle")






public class VehicleController {
    @SuppressWarnings("unused")
    private final ItemService itemService;

    private final VehicleService vehicleService;
    

       public VehicleController(ItemService itemService, VehicleService vehicleService) {
        this.itemService = itemService;
        this.vehicleService = vehicleService;
    }


    


        @PostMapping("/create-vehicle")
        ResponseEntity<Vehicle> createVehicle(@RequestBody Vehicle vehicle){

            vehicleService.createVehicle(vehicle);
            return ResponseEntity.ok(vehicle);

            
        }
    
    
    }
        
    
    
    
    
        
    


