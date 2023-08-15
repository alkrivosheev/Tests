package ru.job4j.loop;

import java.util.StringJoiner;

public class Task18 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        System.out.println("Начало");
        for (int i = 10; i <= 19; i++) {
            if (i % 2 == 0 && i % 4 != 0) {
                joiner.add(String.valueOf(i));
            } else if (i % 4 == 0) {
                joiner.add(i + "#");
            }
        }
        System.out.println(joiner);
        System.out.println("Конец");
    }

    public static void main(String[] args) {
        loop();
    }
}
