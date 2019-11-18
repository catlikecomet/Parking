package com.company.Vehicles;

import com.company.Garage.CanFitLarge;
import com.company.Garage.CanFitSmall;

public class Bike extends AbstractVehicle implements CanFitSmall, CanFitLarge {
    public Bike(String reg) {
        super(reg);
    }

    public void small(){

    }

    public void large(){

    }
}
