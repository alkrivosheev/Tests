package ru.job4j.loop;

import java.util.StringJoiner;

public class Task90 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int sum = 0;
        int summ = 0;
        int proizv = 0;
        int count = 0;
        for (int i = 10; i <= 99 ; i++) {
            sum = (i % 10) + ((i / 10) % 10);
            proizv = (i % 10) * ((i / 10) % 10);
            if ( sum * 2 == proizv) {
                joiner.add(String.valueOf(i));
                summ += i;
                count++;
            }
        }
        System.out.println("Числа: " + joiner + ", Количество: " + count + ", Сумма: " + summ);
    }

    public static void main(String[] args) {
        loop();
    }
}
