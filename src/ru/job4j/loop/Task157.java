package ru.job4j.loop;

import java.util.StringJoiner;

public class Task157 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(String.valueOf(1));
        for (int i = 1; i <= 10000; i++) {
            int summ = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    summ += j;
                }
            }
            if (summ == i) {
                joiner.add(String.valueOf(summ));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
