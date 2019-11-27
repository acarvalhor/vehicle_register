package com.vehicleRegister.vehicleRegister.controllers;

import com.vehicleRegister.vehicleRegister.domains.Vehicle;
import com.vehicleRegister.vehicleRegister.domains.VehicleType;
import com.vehicleRegister.vehicleRegister.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @RequestMapping(value = "/findAllVehicle", method = RequestMethod.GET)
    public ResponseEntity<?> findAllVehicle(){
        return ResponseEntity.ok(vehicleService.findAllVehicle());
    }
    @RequestMapping(value = "/findAllVehicleType", method = RequestMethod.GET)
    public ResponseEntity<?> findAllVehicleType(){
        return ResponseEntity.ok(vehicleService.findAllVehicleType());
    }

    @RequestMapping(value = "/insertVehicle", method = RequestMethod.POST)
    public ResponseEntity<?> saveVehicle(@RequestBody Vehicle vehicle){
        return ResponseEntity.ok(vehicleService.saveVehicle(vehicle));
    }

    @RequestMapping(value = "/insertVehicleType", method = RequestMethod.POST)
    public ResponseEntity<?> insertVehicleType(@RequestBody VehicleType vehicleType){
        return ResponseEntity.ok(vehicleService.insertVehicleType(vehicleType));
    }
}
