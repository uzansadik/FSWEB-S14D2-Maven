package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globalRating;

    public LampType getStyle() {
        return style;
    }

    public void setStyle(LampType style) {
        this.style = style;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public int getGlobalRating() {
        return globalRating;
    }

    public void setGlobalRating(int globalRating) {
        this.globalRating = globalRating;
    }

    public Lamp(LampType style, boolean battery, int globalRating) {
     setBattery(battery);
     setGlobalRating(globalRating);
     setStyle(style);
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on");
    }

    public int getGlobRating() {
        return globalRating;
    }
}
