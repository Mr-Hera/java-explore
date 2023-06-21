package com.randellhera;

import java.awt.*;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Arrays null values
        int[] numbers = new int[3];
        Arrays.fill(numbers, -1);
        numbers[2] = 27;
        System.out.println(Arrays.toString(numbers));

        String[] names = new String[3];
        Arrays.fill(names, "foo");
        names[1] = "Jamila";
        System.out.println(Arrays.toString(names));
    }
}