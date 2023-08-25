package ru.job4j.loop;

import java.util.StringJoiner;

public class Task52 {
    public static void loop(int n, int m) {
        StringJoiner joiner = new StringJoiner(" ");
        if (n > m) {
            int x = n;
            n = m;
            m = x;
        }
        for (int i = 0; i < n; i++) {
            joiner.add(String.valueOf(m + i));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(5, 3);
    }
}
