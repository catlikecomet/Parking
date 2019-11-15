package com.company.Garage;

public class Space extends Floor{
    private int floor;
    private String size;
    private boolean occupied;

    public Space(int currentFloor, String spaceSize){
        floor = currentFloor;
        size = spaceSize;
        occupied = false;
    }

    public boolean getOccupied() {
        return occupied;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
}
