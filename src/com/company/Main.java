package com.company;

import com.company.Garage.*;
import com.company.Vehicles.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<LargeVehicle> largeVehicles = Arrays.asList(
                new Van("KO20UHL"),
                new Van("MN02JUK")
        );

        List<SmallVehicle> smallVehicles = Arrays.asList(
                new Car("HY89JAQ"),
                new Bike("YH87YHJ"),
                new Car("HU09QWE")
        );

        List<Vehicle>vehicles = new ArrayList<>();
        vehicles.addAll(largeVehicles);
        vehicles.addAll(smallVehicles);
        System.out.println(vehicles);

        List<Space> spaces = new ArrayList<>(

        );
        Floor.createSpaces(spaces, 20);

    }
}
