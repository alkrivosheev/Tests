package ru.job4j.loop;

import java.util.StringJoiner;

public class Task37 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i <= 130; i++) {
            if ((i % 10) * (i / 100 % 10) == (i / 10 % 10) * (i / 10 % 10)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
