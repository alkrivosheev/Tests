package ru.job4j.loop;

import java.util.StringJoiner;

public class Task166 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i <= 300; i++) {
            int summ = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && j % 2 != 0) {
                    summ += j;
                }
            }
            if (i % 10 == 0 && summ % 10 == 0 ) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
