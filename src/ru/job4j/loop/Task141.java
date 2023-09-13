package ru.job4j.loop;

import java.util.StringJoiner;

public class Task141 {
    public static void loop(int x, int y) {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        int start = 0;
        int end = 0;
        if (x > y) {
            start = x;
            end = y;
        } else {
            start = y;
            end = x;
        }
        for (int i = 0; i < 100; i++) {
            if (start % 2 != 0) {
                start--;
                if (end == start) {
                    break;
                }
                joiner.add(String.valueOf(start));
                count++;
            } else {
               start /= 2;
                if (end == start) {
                    break;
                }
               joiner.add(String.valueOf(start));
               count++;
            }
        }
        if (joiner.length() == 0) {
            System.out.println("Числа: " + 0 + ", Количество: " + 0);
        } else {
            System.out.println("Числа: " + joiner + ", Количество: " + count);
        }
    }

    public static void main(String[] args) {
        loop(2, 3);
    }
}
