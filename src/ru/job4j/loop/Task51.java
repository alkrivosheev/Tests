package ru.job4j.loop;

import java.util.StringJoiner;

public class Task51 {
    public static void loop(int n, int m) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = n; i <= m ; i++) {
            if (i % 2 != 0) {
                joiner.add(String.valueOf(i * i));
            } else {
                joiner.add("0");
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(2, 2);
    }
}
