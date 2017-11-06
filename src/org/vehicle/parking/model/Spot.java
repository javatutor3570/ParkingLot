package org.vehicle.parking.model;

import org.vehicle.parking.model.constant.SpotSize;

public class Spot {
    private String id;
    private String storey;
    private SpotSize size;

    public Spot(final String id, final String storey, final SpotSize size){
        this.id = id;
        this.storey = storey;
        this.size = size;
    }

}
