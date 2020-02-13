package com.vehicleRegister.vehicleRegister.service.imp;

import com.vehicleRegister.vehicleRegister.domains.Vehicle;
import com.vehicleRegister.vehicleRegister.domains.VehicleType;
import com.vehicleRegister.vehicleRegister.repository.VehicleRepository;
import com.vehicleRegister.vehicleRegister.repository.VehicleTypeRepository;
import com.vehicleRegister.vehicleRegister.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleImplement implements VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    @Autowired
    VehicleTypeRepository vehicleTypeRepository;

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    @Cacheable(cacheNames = "Vehicle", key = "#root.method.name")
    public List<Vehicle> findAllVehicle() {
        return vehicleRepository.findAll();
    }

    @Override
    public List<VehicleType> findAllVehicleType() {
        return vehicleTypeRepository.findAll();
    }

    @Override
    public VehicleType insertVehicleType(VehicleType vehicleType) {
        return vehicleTypeRepository.save(vehicleType);
    }
}
