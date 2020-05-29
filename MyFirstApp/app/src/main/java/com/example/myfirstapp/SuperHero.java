package com.example.myfirstapp;

public class SuperHero {

    private int id;
    private String name;
    private float power;
    private boolean underWearOut;

    public SuperHero(int id, String name, float power, boolean underWearOut) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.underWearOut = underWearOut;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public boolean isUnderWearOut() {
        return underWearOut;
    }

    public void setUnderWearOut(boolean underWearOut) {
        this.underWearOut = underWearOut;
    }

}
