package org.example.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getPillows() {
        return pillows;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    public void setQuilt(int quilt) {
        this.quilts = quilt;
    }

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        setStyle(style);
        setPillows(pillows);
        setHeight(height);
        setSheets(sheets);
        setQuilt(quilt);
    }

    public void make(){
        System.out.println("The bed is being made.");
    }


}
