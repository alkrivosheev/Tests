package ru.job4j.array;

import java.util.Arrays;

public class Task80 {
    public static int[] array(int[] nums) {
        int[] res = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (arrTest(nums, nums[i]) == 1) {
                res[j] = i;
                j ++;
            }
        }
        return Arrays.copyOfRange(res, 0, j);
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
        System.out.println(Arrays.toString(array(arr)));
    }
}
