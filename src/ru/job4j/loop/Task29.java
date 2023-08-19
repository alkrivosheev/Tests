package ru.job4j.loop;

import java.util.StringJoiner;

public class Task29 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i <= 150; i++) {
            if (i % 10 + (i / 10) % 10 + (i / 100) % 10  == num) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(5);
    }
}
