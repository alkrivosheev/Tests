package ru.job4j.loop;

import java.util.StringJoiner;

public class Task27 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = num * - 1 + 1; i < num; i++) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(2);
    }
}
