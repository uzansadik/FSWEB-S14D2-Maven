package org.example.model;

import org.example.model.enums.Room;

import java.awt.*;

public class Bedroom extends Room {
    private String name;

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Ceiling ceiling;

    private Lamp lamp;

    private Bed bed;

    private Wardrobe wardrobe;

    private Carpet carpet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public void setWall1(Wall wall1) {
        this.wall1 = wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public void setWall2(Wall wall2) {
        this.wall2 = wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public void setWall3(Wall wall3) {
        this.wall3 = wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public void setWall4(Wall wall4) {
        this.wall4 = wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp, Bed bed, Wardrobe wardrobe, Carpet carpet) {
        setName(name);
        setWall1(wall1);
        setWall2(wall2);
        setWall3(wall3);
        setWall4(wall4);
        setCeiling(ceiling);
        setLamp(lamp);
        setBed(bed);
        setWardrobe(wardrobe);
        setCarpet(carpet);
    }
}
