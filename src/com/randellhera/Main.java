package com.randellhera;

import java.awt.*;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        loops and arrays
        String[] names = {
                "James",
                "Nadia",
                "Sophia",
                "Alex",
                "Aisha",
        };

//        loop
//        for(int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

//        reverse order
        for(int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}