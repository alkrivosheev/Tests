package ru.job4j.loop;

import java.util.StringJoiner;

public class Task135 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner("");
        String stNum = String.valueOf(num);
        for (int i = stNum.length() - 1; i >= 0; i-- ) {
            joiner.add(String.valueOf(stNum.charAt(i)));
        }
        System.out.println(Integer.valueOf(joiner.toString()));
    }

    public static void main(String[] args) {
        loop(350);
    }
}
