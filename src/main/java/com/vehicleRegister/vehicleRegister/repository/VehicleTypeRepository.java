package com.vehicleRegister.vehicleRegister.repository;

import com.vehicleRegister.vehicleRegister.domains.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {
}
