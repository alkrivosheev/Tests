package ru.job4j.loop;

import java.util.StringJoiner;

public class Task44 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int a, b, c;
        for (int i = 100; i <= 999; i++) {
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100 % 10;
            if (!(a == 0 && b == 0) && (i != c + (b * 10) + (a * 100)) && (Math.sqrt(i * (c + (b * 10) + (a * 100))) % 1 == 0)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
