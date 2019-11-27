package com.vehicleRegister.vehicleRegister.repository;

import com.vehicleRegister.vehicleRegister.domains.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
