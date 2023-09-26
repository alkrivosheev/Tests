package ru.job4j.loop;

import java.util.StringJoiner;

public class Task155 {
    public static void loop() {
        for (int i = 10; i <= 20; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count += j;
                }
            }
            System.out.println("Число: " + i + ", сумма делителей: " + count);
        }
    }

    public static void main(String[] args) {
        loop();
    }
}
