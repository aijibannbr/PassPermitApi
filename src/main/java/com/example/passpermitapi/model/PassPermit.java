package com.example.passpermitapi.model;

import jakarta.persistence.*;

@Entity
public class PassPermit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String vehicleNumber;
    private String vehicleDetails;
    @Column(nullable = false)
    private String ownerIdNumber;
    @Column(nullable = false)
    private String ownerName;
    private String ownerMidName;
    @Column(nullable = false)
    private boolean isActive;

    public Integer getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = Math.toIntExact(id);
    }

    public String getOwnerIdNumber() {
        return ownerIdNumber;
    }

    public void setOwnerIdNumber(String ownerIdNumber) {
        this.ownerIdNumber = ownerIdNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerMidName() {
        return ownerMidName;
    }

    public void setOwnerMidName(String ownerMidName) {
        this.ownerMidName = ownerMidName;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }
}
