package ru.job4j.loop;

import java.util.StringJoiner;

public class Task50 {
    public static void loop(int n) {
        StringJoiner joiner = new StringJoiner(" ");
        int counter = 0;
        int sum = 1;
        while (counter < 5) {
            counter++;
            joiner.add(String.valueOf(sum));
            sum += n;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(3);
    }
}
