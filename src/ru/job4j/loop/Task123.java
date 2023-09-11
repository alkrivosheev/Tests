package ru.job4j.loop;

import javax.management.StringValueExp;
import java.util.StringJoiner;

public class Task123 {
    public static void loop(int num) {
        int summ1 = 0;
        int summ2 = 0;
        StringJoiner joiner = new StringJoiner(" ");
        String stNum = String.valueOf(num);
        if (stNum.length() > 1) {
            for (int i = 0; i < stNum.length(); i++) {
                int intgr = Integer.valueOf(String.valueOf(stNum.charAt(i)));
                summ1 += intgr;
            }
            joiner.add(String.valueOf(summ1));
        }
        stNum = String.valueOf(summ1);
        if (stNum.length() > 1) {
            for (int i = 0; i < stNum.length() ; i++) {
                int intgr = Integer.valueOf(String.valueOf(stNum.charAt(i)));
                summ2 += intgr;
            }
            joiner.add(String.valueOf(summ2));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(5);
    }
}
