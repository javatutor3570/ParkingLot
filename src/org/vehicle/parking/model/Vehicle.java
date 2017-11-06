package org.vehicle.parking.model;

public abstract class Vehicle {
    private String licencePlateNo;

    public Vehicle(final String licencePlateNo){
        this.licencePlateNo = licencePlateNo;
    }

    public String getLicencePlateNo() {
        return licencePlateNo;
    }

    public void setLicencePlateNo(String licencePlateNo) {
        this.licencePlateNo = licencePlateNo;
    }
}
