package ru.job4j.loop;

import java.util.StringJoiner;

public class Task35 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        while (count < 5) {
            count++;
            num -= 6;
            joiner.add(String.valueOf(num));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(10);
    }
}
