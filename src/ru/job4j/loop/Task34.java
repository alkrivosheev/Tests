package ru.job4j.loop;

import java.util.StringJoiner;

public class Task34 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        for (int i = num + 1; i > 0 ; i++) {
            if (i % 2 != 0 && count <= 5) {
                joiner.add(String.valueOf(i));
                count++;
            } else if (count == 5) {
                break;
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(6);
    }
}
