package com.example.marsweather.model;

import com.google.gson.annotations.SerializedName;

public class WeatherStatus {

    private String season;
    private Air air;

    public WeatherStatus(){

    }

    public WeatherStatus(String season, Air air) {
        this.season = season;
        this.air = air;
    }

    public WeatherStatus(String season, float average, float maximum, float minimum) {
        this.season = season;
        Temperature temperature = new Temperature(average, maximum, minimum);
        this.air = new Air(temperature);
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public Air getAir() {
        return air;
    }

    public void setAir(Air air) {
        this.air = air;
    }


    public class Air {
        private Temperature temperature;

        public Air(Temperature temperature) {
            this.temperature = temperature;
        }

        public Temperature getTemperature() {
            return temperature;
        }

        public void setTemperature(Temperature temperature) {
            this.temperature = temperature;
        }
    }


    public class Temperature {
        private float average;
        private float min;
        private float max;

        public Temperature(float average, float min, float max) {
            this.average = average;
            this.min = min;
            this.max = max;
        }

        public float getAverage() {
            return average;
        }

        public void setAverage(float average) {
            this.average = average;
        }

        public float getMin() {
            return min;
        }

        public void setMin(float min) {
            this.min = min;
        }

        public float getMax() {
            return max;
        }

        public void setMax(float max) {
            this.max = max;
        }
    }
}