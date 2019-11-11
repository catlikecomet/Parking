package com.company.Garage;

import java.util.Arrays;
import java.util.List;

public class FirstFloor extends Garage{
    public static void getSpaces(List<Space> spaces){
        int smallFirstSpaces = 12;
        int largeFirstSpaces = 13;
        createSpaces(spaces, smallFirstSpaces);
        createSpaces(spaces, largeFirstSpaces);

        System.out.println("small spaces: " + smallFirstSpaces);
        System.out.println("large spaces: " + largeFirstSpaces);
    }
}

