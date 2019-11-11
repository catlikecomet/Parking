package com.company.Garage;

public class Space {
    private boolean occupied;
    private String size;
    private String floor;
    private Integer spaceID;

    public Space(String newFloor, Integer newID){
        occupied = false;
        floor = newFloor;
        spaceID = newID;
    }

    public boolean isOccupied() {
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

    public Integer getSpaceID() {
        return spaceID;
    }

    public void setSpaceID(Integer spaceID) {
        this.spaceID = spaceID;
    }
}
