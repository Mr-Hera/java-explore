package com.randellhera;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /*
        - Access Modifier
        - Optional Static
        - Return Type
        - Name
        - Optional Parameters
        - Method Body
        - Optional Return Value
    */

    public static void main(String[] args) {
//        classes
        Cat cat = new Cat("Tom");
        cat.hunts();
        Rat rat = new Rat("Jerry");
        rat.runs();
    }

    static class Cat {
        String name;

        public Cat () {

        }

        public Cat(String name) {
            this.name = name;
        }
        void hunts() {
            System.out.println(name + " hunts...");
        }
    }

    static class Rat {
        String name;

        public Rat() {

        }

        public Rat(String name) {
            this.name = name;
        }

        void runs() {
            System.out.println(name + " runs!");
        }

    }
}