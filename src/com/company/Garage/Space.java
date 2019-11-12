package com.company.Garage;

public class Space {
    private String floor;
    private String size;
    private boolean occupied;

    public Space(String currentFloor, String spaceSize){
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
    public String getFloor() {
        return floor;
    }
    public void setFloor(String floor) {
        this.floor = floor;
    }
}
