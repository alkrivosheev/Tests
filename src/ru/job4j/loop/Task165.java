package ru.job4j.loop;

import java.math.BigInteger;
import java.util.StringJoiner;

public class Task165 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        boolean probablePrime;
        for (int i = 2; i <= num; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
            if (probablePrime && num % i == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(10);
    }
}
