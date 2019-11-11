package com.company.Garage;

import java.util.List;

public class Garage{

    public static void createSpaces(List<Space> spaces, int size){

        for(int i = 0; i < size; i++){
            Space space = new Space("",size);
            spaces.add(space);
        }
        System.out.println(spaces);
    }

    public void small(CanFitSmall vehicle){
        vehicle.small();
    }

    public void large(CanFitLarge vehicle){
        vehicle.large();
    }

}
