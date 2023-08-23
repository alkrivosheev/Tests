package ru.job4j.loop;

import java.util.StringJoiner;

public class Task49 {
    public static void loop(int n, int m) {
        StringJoiner joiner = new StringJoiner("+");
        if (n > m) {
            int x = n;
            n = m;
            m = x;
        }
        for (int i = n; i <= m; i++) {
            if (i % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(10, 3);
    }
}
