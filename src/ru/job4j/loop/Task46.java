package ru.job4j.loop;

import java.util.StringJoiner;

public class Task46 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int b, c;
        for (int i = 1000; i <= 1500; i++) {
            b = i / 10 % 10;
            c = i / 100 % 10;
            if (num == b + (c * 10)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(23);
    }
}
