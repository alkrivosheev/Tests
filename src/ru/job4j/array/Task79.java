package ru.job4j.array;

import java.util.StringJoiner;

public class Task79 {
    public static void array(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            if (arrTest(nums , nums[i]) > 1) {
                joiner.add(String.valueOf(nums[i]));
            }
        }
        System.out.println(joiner);
    }

    public static int arrTest (int[] nums , int test) {
        int count = 0;
        for (int num : nums) {
            if (num == test) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 3, 3, 1};
        array(arr);
    }
}
