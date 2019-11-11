package com.company.Garage;

import java.util.List;

public class GroundFloor extends Garage{

    public static void getSpaces(List<Space> spaces){
        int smallGroundSpaces = 15;
        int largeGroundSpaces = 5;
        createSpaces(spaces, smallGroundSpaces);
        createSpaces(spaces, largeGroundSpaces);

        System.out.println("small spaces: " + smallGroundSpaces);
        System.out.println("large spaces: " + largeGroundSpaces);
    }
}
