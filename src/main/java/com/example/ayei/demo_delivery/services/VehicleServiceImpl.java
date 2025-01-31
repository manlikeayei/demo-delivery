package com.example.ayei.demo_delivery.services;

import java.util.List;
import java.util.Optional;

import entities.Vehicle;
import repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
      return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle updateVehicle(Long id, Vehicle vehicle) {
     Optional<Vehicle> optionalVehicle = this.vehicleRepository.findById(id);
     
     if (optionalVehicle.isPresent()){
        Vehicle newVehicle = optionalVehicle.get();
        newVehicle.setName(vehicle.getName());
        newVehicle.setItems(vehicle.getItems());
        vehicleRepository.save(newVehicle);
        return newVehicle;
     } else{
        throw new RuntimeException("Record not found");
     }

     
    }

    @Override
    public List<Vehicle> getAllVehciles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleByPlateNumber(String plateNumber) {
        return vehicleRepository.getVehicleByPlateNumber(plateNumber);
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }



}
