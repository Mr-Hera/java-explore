package com.randellhera;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String fName = "Randell";
        String lName = "Hera";
        String fullName = fName + lName;

        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.substring(7));
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println(" a ".trim());
    }
}