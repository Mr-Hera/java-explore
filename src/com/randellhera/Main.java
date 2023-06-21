package com.randellhera;

import java.awt.*;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Arrays
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 6;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] numbers2 = {0, 5, 6, 8, 9};
        System.out.println(Arrays.toString(numbers2));
        numbers2[1] = 55;
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);

        String[] people = {"Randell", "Hera"};
        System.out.println(Arrays.toString(people));
    }
}