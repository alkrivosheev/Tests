package ru.job4j.loop;

import java.util.StringJoiner;

public class Task16 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = 1; i <= 9; i++) {
                joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop();
    }
}
