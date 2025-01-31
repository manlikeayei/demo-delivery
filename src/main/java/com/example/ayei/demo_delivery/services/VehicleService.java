package com.example.ayei.demo_delivery.services;

import java.util.List;

import entities.Vehicle;

public interface VehicleService {


    Vehicle createVehicle (Vehicle vehicle);
    Vehicle updateVehicle (Long id, Vehicle vehicle);
    List<Vehicle> getAllVehciles();
    Vehicle getVehicleByPlateNumber (String plateNumber);
    void deleteVehicle (Long id);

    
}