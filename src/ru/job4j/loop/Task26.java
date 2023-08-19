package ru.job4j.loop;

import java.util.StringJoiner;

public class Task26 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int counter = num * 2;
        int res = 0;
        while (counter > 0) {
            joiner.add(String.valueOf(res));
            res -= 8;
            counter--;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(2);
    }
}
