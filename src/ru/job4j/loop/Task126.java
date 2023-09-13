package ru.job4j.loop;

import java.util.StringJoiner;

public class Task126 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        StringJoiner joiner1 = new StringJoiner(" ");
        String stNum = String.valueOf(num);
        for (int i = 0; i < stNum.length(); i++ ) {
            int intgr = Integer.valueOf(String.valueOf(stNum.charAt(i)));
            if (i % 2 != 0) {
                joiner.add(String.valueOf(intgr));
            } else {
                joiner1.add(String.valueOf(intgr));
            }
        }
        if (joiner.length() > 0 ) {
            System.out.println(joiner);
        }
        if (joiner1.length() > 0) {
            System.out.println(joiner1);
        }
    }

    public static void main(String[] args) {
        loop(261705);
    }
}
