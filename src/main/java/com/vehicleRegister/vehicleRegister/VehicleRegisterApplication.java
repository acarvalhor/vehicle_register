package com.vehicleRegister.vehicleRegister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class VehicleRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRegisterApplication.class, args);
	}

}
