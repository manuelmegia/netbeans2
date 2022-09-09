package org.example;

import java.util.Objects;

public class Comparo implements Comparable {
    String color;

    Comparo(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Object c) {
        Comparo comp = (Comparo) c;
        return this.color.compareTo(comp.color);
    }

    @Override
    public String toString() {
        return "Comparo{" + "color='" + color + '\'' + '}';
    }
}
