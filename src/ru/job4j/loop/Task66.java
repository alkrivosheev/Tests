package ru.job4j.loop;

import java.util.StringJoiner;

public class Task66 {
    public static void loop(int num) {
        int count = 0;
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                joiner.add(String.valueOf(i));
            }
        }
        if (count == 0) {
            joiner.add(String.valueOf(0));
        }
        System.out.println("Количество: " + count + ", Делители: " + joiner);
    }

    public static void main(String[] args) {
        loop(1);
    }
}
