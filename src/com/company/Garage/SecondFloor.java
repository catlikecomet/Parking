package com.company.Garage;

import java.util.List;

public class SecondFloor extends Garage{

    public static void getSpaces(List<Space> spaces){
        int smallSecondSpaces = 20;
        int largeSecondSpaces = 10;
        createSpaces(spaces, smallSecondSpaces);
        createSpaces(spaces, largeSecondSpaces);

        System.out.println("small spaces: " + smallSecondSpaces);
        System.out.println("large spaces: " + largeSecondSpaces);
    }
}

