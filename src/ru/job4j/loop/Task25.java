package ru.job4j.loop;

import java.util.StringJoiner;

public class Task25 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int counter = num;
        int res = 7;
        while (counter > 0) {
            joiner.add(String.valueOf(res));
            res += 4;
            counter--;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(5);
    }
}
