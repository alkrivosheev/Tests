package ru.job4j.condition;

public class HelloWorld {
    public static String checkNumber(int number) {
        boolean three = number % 3 == 0;
        boolean five = number % 5 == 0;
        if (three && five) {
            return "Hello, World!!!";
        } else if (three) {
            return "Hello";
        } else if (five) {
            return "World";
        } else {
            return "Operation not support";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(14));
    }
}