package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Comparo> lol = new ArrayList<>();
        lol.add(new Comparo("negro"));
        lol.add(new Comparo("blanco"));
        System.out.println(lol);
        Collections.sort(lol);
        System.out.println(lol);
    }
}