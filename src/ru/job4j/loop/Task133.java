package ru.job4j.loop;

import java.util.StringJoiner;

public class Task133 {
    public static void loop(int num) {
        if (num < 1000) {
            StringJoiner joiner = new StringJoiner(" ");
            int summ = 0;
            for (int i = 1; i < 1000; i++) {
                summ = (int) Math.pow(num, i);
                if (summ < 1000) {
                    joiner.add(String.valueOf(summ));
                } else {
                    break;
                }
            }
            System.out.println(joiner);
        }
    }

    public static void main(String[] args) {
        loop(5);
    }
}
