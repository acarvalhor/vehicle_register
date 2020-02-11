package com.vehicleRegister.vehicleRegister.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String plate;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST })
    private VehicleType vehicleType;
}
