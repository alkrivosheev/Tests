package ru.job4j.loop;

import java.util.StringJoiner;

public class Task61 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int num1, num2, num3;
        for (int i = 100; i <= 500; i++) {
            num1 = i % 10;
            num2 = i / 10 % 10;
            num3 = i / 100 % 10;
            if ((num1 * num1) + (num3 * num3) == num2 * num2) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
