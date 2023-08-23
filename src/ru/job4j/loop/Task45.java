package ru.job4j.loop;

import java.util.StringJoiner;

public class Task45 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int a, b;
        for (int i = 100; i <= 500; i++) {
            a = i % 10;
            b = i / 10 % 10;
            if (num == a + (b * 10)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
loop(23);
    }
}
