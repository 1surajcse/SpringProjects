package com.example.demoATP;

import javax.persistence.*;

@Entity
@Table(name="Vehicle_Suraj")
public class Vehicle {
    public Vehicle() {

    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
    private String name;
}
