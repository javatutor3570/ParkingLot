package org.vehicle.parking.service;

import org.vehicle.parking.model.Spot;
import org.vehicle.parking.model.Vehicle;

public interface ParkingLot {
    Spot placeVehicle(Vehicle v);
    Spot removeVehicle(Vehicle v);
}
