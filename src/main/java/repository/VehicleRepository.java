package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import entities.Vehicle;

@Repository



public interface VehicleRepository extends JpaRepository<Vehicle, Long> { 
    

    @Query("Select vehicle FROM Vehicle vehicle WHERE vehicle.status='maintenance'")
    List<Vehicle>getVehiclesStatus();


    List<Vehicle> getVehicleByCarryingWeightGreaterThan(float weight); 


    Vehicle getVehicleByPlateNumber(String plateNumber);
}
