package ru.job4j.loop;

import java.util.StringJoiner;

public class Task120 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        String stNum = String.valueOf(num);
        for (int i = stNum.length() - 1; i > 0 ; i--) {
            String str = stNum.substring(0, i);
            joiner.add(str);
        }
        joiner.add(String.valueOf(0));
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(52435);
    }
}
