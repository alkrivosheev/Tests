package ru.job4j.loop;

import java.util.StringJoiner;

public class Task88 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int sum = 0;
        int count = 0;
        for (int i = 10; i <= 99 ; i++) {
            sum = (i % 10) * ((i / 10) % 10);
            if ( sum * 3 == i) {
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
