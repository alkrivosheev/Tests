package ru.job4j.loop;

import java.util.StringJoiner;

public class Task20 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        System.out.println("Начало");
        for (int i = 1550; i >= 1050; i--) {
            if (i % 10 == 0 && i % 100 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
        System.out.println("Конец");
    }

    public static void main(String[] args) {
        loop();
    }
}
