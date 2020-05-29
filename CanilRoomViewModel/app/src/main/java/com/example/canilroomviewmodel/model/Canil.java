package com.example.canilroomviewmodel.model;

import androidx.annotation.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

//@JsonIgnoreProperties({"country_code", "description", "history", "origin", "temperament"})


public class Canil implements Serializable {


    private int id;
    private String name;
    private String life_span;
    private String bred_for;
    private String breed_group;
    @JsonProperty("weight")
    public Map<String,Object> weight = new HashMap<>();

    @JsonProperty("height")
    public Map<String,Object> height = new HashMap<>();


    public Canil(){}

    public Canil(Map<String,Object> weight, Map<String,Object> height, int id, String name, String life_span, String bredFor, String breed_group) {
        this.weight = weight;
        this.height = height;
        this.id = id;
        this.name = name;
        this.life_span = life_span;
        this.bred_for = bredFor;
        this.breed_group = breed_group;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getLife_span() {
        return life_span;
    }
    public String getBred_for() {
        return bred_for;
    }
    public String getBreed_group() {
        return breed_group;
    }

    public Map<String, Object> getWeight() {
        return weight;
    }

    public Map<String, Object> getHeight() {
        return height;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLife_span(String life_span) {
        this.life_span = life_span;
    }
    public void setBred_for(String bred_for) {
        this.bred_for = bred_for;
    }
    public void setBreed_group(String breed_group) {
        this.breed_group = breed_group;
    }

    public void setWeight(Map<String, Object> weight) {
        this.weight = weight;
    }

    public void setHeight(Map<String, Object> height) {
        this.height = height;
    }
}
