package ru.job4j.loop;

import java.util.StringJoiner;

public class Cryptography {
    public static String code(String s) {
        if (s.length() == 0) {
            return "empty";
        } else {
            StringJoiner joiner = new StringJoiner("");
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i < chars.length - 4) {
                    joiner.add("#");
                } else {
                    joiner.add(String.valueOf(chars[i]));
                }
            }
            return joiner.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(code(""));
    }
}
