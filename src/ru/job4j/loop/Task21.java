package ru.job4j.loop;

import java.util.StringJoiner;

public class Task21 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = 38; i >= 10; i--) {
            if (i % 5 == 0) {
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
