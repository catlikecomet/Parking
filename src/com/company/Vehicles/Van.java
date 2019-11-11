package com.company.Vehicles;

import com.company.Garage.CanFitLarge;

public class Van extends AbstractVehicle implements LargeVehicle, CanFitLarge {

    public Van(String reg) {
        super(reg);
    }

    public void large(){

    }
}
