package com.company.Garage;

import java.util.List;

public class Garage {

    public static void createSpaces(List<Space> spaces, int size) {

        int floors = 3;
        //for each loop I need to assign a floor, at the moment
        //each floor will only have one space size...

        for (int a = 1; a <= floors; a++) {

            for (int i = 0; i < size; i++) {
                Space space = new Space(floors, "small");
                spaces.add(space);
            }
            System.out.println(spaces);

        }
    }
    public void small(CanFitSmall vehicle){
        vehicle.small();
    }

    public void large(CanFitLarge vehicle){
        vehicle.large();
    }

}