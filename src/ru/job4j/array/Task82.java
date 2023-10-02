package ru.job4j.array;

import java.util.Arrays;

public class Task82 {
    public static int[] array(int[] nums) {
        int[] res = new int[3];
        for (int num : nums) {
            if (num > 0) {
                res[0] += num;
            } else if (num < 0) {
                res[1] += num;
            } else if (num == 0) {
                res[2] ++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, -3, -4, 0, 3, 1};
        System.out.println(Arrays.toString(array(arr)));
    }
}
