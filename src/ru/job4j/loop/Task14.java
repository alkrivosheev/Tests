package ru.job4j.loop;

import java.util.StringJoiner;

public class Task14 {
    public static void loop(int a, int b) {
        StringJoiner joiner = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = a; i < b; i++) {
            if (i >= 10) {
                joiner.add(String.valueOf(i));
            }
        }

        System.out.println(joiner);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop(-5, 16);
    }
}
