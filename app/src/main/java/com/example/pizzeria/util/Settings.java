package com.example.pizzeria.util;

import java.io.Serializable;

public class Settings implements Serializable {
    private int font;
    private String color;
    private boolean online;

    public Settings(int font, String color, boolean online) {
        this.font = font;
        this.color = color;
        this.online = online;
    }

    public int getFont() {
        return font;
    }

    public String getColor() {
        return color;
    }

    public boolean isOnline() {
        return online;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "font=" + font +
                ", color='" + color + '\'' +
                ", online=" + online +
                '}';
    }
}