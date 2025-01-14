package org.example.model.enums;

public enum LampType {
    NORMAL("Normal"),
    NEON("Neon"),
    LAVA("Lava");

    private String name;

    LampType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
