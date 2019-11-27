package com.vehicleRegister.vehicleRegister.service;

import com.vehicleRegister.vehicleRegister.domains.Vehicle;
import com.vehicleRegister.vehicleRegister.domains.VehicleType;

import java.util.List;

public interface VehicleService {

    Vehicle saveVehicle(Vehicle vehicle);

    List<Vehicle> findAllVehicle();

    List<VehicleType> findAllVehicleType();

    VehicleType insertVehicleType(VehicleType vehicleType);
}
