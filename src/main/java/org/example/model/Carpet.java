package org.example.model;

import org.example.model.enums.PaintColor;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

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

    public Carpet(int width, int height, PaintColor color) {
        setColor(color);
        setHeight(height);
        setWidth(width);
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }

}
