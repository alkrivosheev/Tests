package ru.job4j.loop;

import java.util.StringJoiner;

public class Task15 {
    public static void loop(int a, int b) {
        StringJoiner joiner = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = b; i > a; i--) {
            if (i >= 100) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop(101, 106);
    }
}