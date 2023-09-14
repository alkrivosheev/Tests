package ru.job4j.loop;

import java.util.Locale;
import java.util.StringJoiner;

public class Task145 {
    public static void loop(int num1, double num2) {
        StringJoiner joiner = new StringJoiner(" ");
        double current = num1;
        int count = 0;
        while (Math.sqrt(current) > 1 + num2) {
            current = Math.sqrt(current);
            count++;
            joiner.add(String.format(Locale.ENGLISH, "%.1f", current));
        }
        System.out.println("Промежуточные: " + joiner + ", Количество: " + count);
    }

    public static void main(String[] args) {
        loop(9, 1.6);
    }
}
