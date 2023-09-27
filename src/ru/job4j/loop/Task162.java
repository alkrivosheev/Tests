package ru.job4j.loop;

import java.math.BigInteger;
import java.util.StringJoiner;

public class Task162 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        boolean probablePrime;
        for (int i = 100; i <= 150; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            probablePrime = bigInteger.isProbablePrime((int) Math.log(i));
            if (probablePrime) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}
