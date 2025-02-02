package com.example.ayei.demo_delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ayei.demo_delivery.entities.Vehicle;



    public interface VehicleRepository extends JpaRepository<Vehicle, Long> { 
    

    @Query("Select vehicle FROM Vehicle vehicle WHERE vehicle.status='maintenance'")
    List<Vehicle>getVehiclesStatus();


    List<Vehicle> getVehicleByCarryingWeightGreaterThan(float weight); 


    Vehicle getVehicleByPlateNumber(String plateNumber);
}

