package ru.job4j.loop;

import java.util.StringJoiner;

public class Task24 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int counter = 0;
        num = num - 10;
        while (true) {
            joiner.add(String.valueOf(num));
            num -= 6;
            counter++;
            if (counter == 5) {break;}
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(0);
    }
}
