package com.company;

public class Vehicle {

    private String color;
    private Double topSpeed;

    public Vehicle() {

    }

    public Vehicle(String color, Double topSpeed) {
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public String getColor() {
        return color;
    }

    public Double getTopSpeed() {
        return topSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTopSpeed(Double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void methodOverriding(){
        System.out.println("This is a method from father class overriding");
    }
}
