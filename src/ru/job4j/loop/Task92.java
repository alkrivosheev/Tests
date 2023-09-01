package ru.job4j.loop;

import java.util.StringJoiner;

public class Task92 {
    public static void loop(int a1, int n1, int a2, int n2) {
        StringJoiner joiner = new StringJoiner(" ");
        int step = a2 / n2;
        if (a1 + step == a2) {
            System.out.println("Нет чисел");
        } else {
            for (int i = a1 + step; i < a2; i += step) {
                joiner.add(String.valueOf(i));
            }
            System.out.println(joiner);
        }
    }

    public static void main(String[] args) {
        loop(2, 1, 8, 4);
    }
}
