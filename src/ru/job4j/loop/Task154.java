package ru.job4j.loop;

import java.util.StringJoiner;

public class Task154 {
    public static void loop() {
        for (int i = 10; i <= 20; i++) {
            StringJoiner joiner = new StringJoiner(" ");
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    joiner.add(String.valueOf(j));
                }
            }
            System.out.println("Число: " + i + ", делители: " + joiner);
        }
    }

    public static void main(String[] args) {
        loop();
    }
}
