package ru.job4j.loop;

import java.util.StringJoiner;

public class Task111 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int sum = 0;
        int n = num;
        while (sum + n + 1 < num * num) {
            n++;
            joiner.add(String.valueOf(n));
            sum += n;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(5);
    }
}
