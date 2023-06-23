package ru.job4j.strings;

public class Task22 {
    public static void nameInsert(String name) {
        System.out.println(String.format("Привет, %s!", name));
    }

    public static void main(String[] args) {
        nameInsert("Николай");
    }
}
