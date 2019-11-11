package com.company.Vehicles;

import com.company.Garage.CanFitLarge;
import com.company.Garage.CanFitSmall;
import com.company.Garage.Garage;

public class Car extends AbstractVehicle implements SmallVehicle, CanFitSmall, CanFitLarge {
    public Car(String reg) {
        super(reg);

    }

    public void small (){

    }

    public void large(){

    }


}
