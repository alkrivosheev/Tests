package ru.job4j.loop;

import java.util.StringJoiner;

public class Task19 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = 100; i <= 153; i++) {
            if (i % 10 == 7) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop();
    }
}
