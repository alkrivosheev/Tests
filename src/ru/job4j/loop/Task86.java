package ru.job4j.loop;

import java.util.StringJoiner;

public class Task86 {
    public static void loop(int[] num) {
        int count = 0;
        int sum = 0;
        int n2 = 0;
        int sum2 = 0;
        StringJoiner joiner = new StringJoiner(" ");
        for (int n : num) {
            sum = (n % 10) + ((n / 10) % 10);
            n2 = n * 2;
            sum2 = (n2 % 10) + ((n2 / 10) % 10);
            if (sum == sum2) {
                count++;
                joiner.add(String.valueOf(n));
            }
        }
        if (count == 0) {
            System.out.println("Стабильных чисел нет");
        } else {
            System.out.println(joiner);
        }
    }

    public static void main(String[] args) {
        int[] rs = {36, 39};
        loop(rs);
    }
}
