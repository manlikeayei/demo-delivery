package com.example.ayei.demo_delivery.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@Entity

@NoArgsConstructor
@AllArgsConstructor

public class Vehicle {


 @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String plateNumber;
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPlateNumber() {
        return plateNumber;
    }


    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public float getFuelCapacity() {
        return fuelCapacity;
    }


    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    public float getCarryingWeight() {
        return carryingWeight;
    }


    public void setCarryingWeight(float carryingWeight) {
        this.carryingWeight = carryingWeight;
    }


    public List<Item> getItems() {
        return items;
    }


    public void setItems(List<Item> items) {
        this.items = items;
    }


    private String status;
    private String type;
    private float fuelCapacity;
    private float carryingWeight;


    @OneToMany
    private List<Item> items;
    



}
