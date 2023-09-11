package ru.job4j.loop;

import java.util.StringJoiner;

public class Task122 {
    public static void loop(int[] nums) {
        int summ = 0;
        StringJoiner joiner = new StringJoiner(" ");
        for (int num : nums) {
            String stNum = String.valueOf(num);
            summ = 0;
            for (int i = 0; i < stNum.length() ; i++) {
                int intgr = Integer.valueOf(String.valueOf(stNum.charAt(i)));
                summ += intgr;
            }
            if (summ == 5) {
                break;
            }
            joiner.add(String.valueOf(num));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        int[] nums = {11, 222, 36, 23, 10};
        loop(nums);
    }
}
