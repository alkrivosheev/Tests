package ru.job4j.loop;

import java.util.StringJoiner;

public class Task124 {
    public static void loop(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        int summ = 0;
        int max = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            String stNum = String.valueOf(nums[i]);
            summ = 0;
            for (int j = 0; j < stNum.length(); j++ ) {
                int intgr = Integer.valueOf(String.valueOf(stNum.charAt(j)));
                    summ += intgr;
            }
            if (max < summ) {
                max = summ;
                index = i;
            }
            joiner.add(String.valueOf(summ));
        }
        System.out.println("Суммы: " + joiner + ", индекс: " + index);
    }

    public static void main(String[] args) {
        int[] nums = {4, 351, 250, 29, 93};
        loop(nums);
    }
}
