package ru.job4j.loop;

import java.util.StringJoiner;

public class Task31 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            if ((i % 10) * (i / 10 % 10) < num) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(5);
    }
}
