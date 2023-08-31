package ru.job4j.loop;

import java.util.StringJoiner;

public class Task89 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int sum = 0;
        int count = 0;
        for (int i = 100; i <= 999 ; i++) {
            sum = (int) Math.pow((i % 10), 3) + (int) Math.pow((i / 10) % 10, 3) + (int) Math.pow((i / 100) % 10, 3);
            if ( sum == i) {
                joiner.add(String.valueOf(i));
                count++;
            }
        }
        System.out.println("Числа: " + joiner + ", Количество: " + count);
    }

    public static void main(String[] args) {
        loop();
    }
}
