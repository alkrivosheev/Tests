package ru.job4j.loop;

import java.util.StringJoiner;

public class Task67 {
    public static void loop(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (num == 1) {
            count++;
        }
        if (count == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(1);
    }
}
