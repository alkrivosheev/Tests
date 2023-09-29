package ru.job4j.array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.StringJoiner;

public class Task79 {
    public static void array(int[] nums) {
        HashSet<Integer> mySet = new LinkedHashSet<>();
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < nums.length; i++) {
            if (arrTest(nums , nums[i]) > 1) {
                mySet.add(nums[i]);
            }
        }
        for (int num : mySet) {
            joiner.add(String.valueOf(num));
        }
        if (joiner.length() > 0) {
            System.out.println(joiner);
        } else {
            System.out.print("");
        }
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
        int[] arr = {5, 5, 4, 3, 3, 1, 5, 4, 2};
        array(arr);
    }
}
