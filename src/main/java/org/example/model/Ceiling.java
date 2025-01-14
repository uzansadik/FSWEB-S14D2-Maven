package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor color;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void setColor(PaintColor color) {
        this.color = color;
    }

    public Ceiling(int height, PaintColor color) {
        setColor(color);
        setHeight(height);
    }

    public void create(){
        System.out.println("Ceiling has been built.");
    }
}
