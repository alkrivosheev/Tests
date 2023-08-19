package ru.job4j.loop;

import java.util.StringJoiner;

public class Task23 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 1; i <= 5; i++) {
            joiner.add(String.valueOf(num + i));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(10);
    }
}
