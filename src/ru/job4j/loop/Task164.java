package ru.job4j.loop;

import java.util.StringJoiner;

public class Task164 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i < 99; i++) {
            if (i * i <= 300) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
