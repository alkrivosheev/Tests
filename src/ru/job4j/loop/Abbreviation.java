package ru.job4j.loop;

import java.util.StringJoiner;

public class Abbreviation {
    public static String collect(String s) {
        StringJoiner joiner = new StringJoiner("");
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                joiner.add(String.valueOf(chars[i]));
            }
            if (String.valueOf(chars[i]).equals(" ")) {
                joiner.add(String.valueOf(chars[i + 1]));
            }
        }
        return joiner.toString();
    }

    public static void main(String[] args) {
        System.out.println(collect("North Atlantic Treaty Organization"));
    }
}
