package ru.job4j.loop;

import java.util.StringJoiner;

public class Task47 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int a, b, c, d;
        for (int i = 1345; i <= 1445; i++) {
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100 % 10;
            d = i / 1000 % 10;
            if (a + b == 5 && c + d == 5) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
