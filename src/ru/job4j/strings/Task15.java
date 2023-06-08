package ru.job4j.strings;

public class Task15 {
    public static void main(String[] args) {
        String source = "+!?";
        System.out.println(source.substring(0, 1) + source.substring(0, 1) + source.substring(0, 1));
        System.out.println(source.substring(1, 2) + source.substring(1, 2) + source.substring(1, 2) + source.substring(1, 2));
        System.out.println(source.substring(2) + source.substring(2));
    }
}
