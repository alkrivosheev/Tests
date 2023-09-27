package ru.job4j.loop;

import java.util.StringJoiner;

public class Task163 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            int summ = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    summ += j;
                }
            }
            if (summ % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
