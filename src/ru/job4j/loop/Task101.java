package ru.job4j.loop;

public class Task101 {
    public static void loop(int[] num) {
        int max = 0;
        int min = 0;
        for (int n : num) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        System.out.println("Max: " + max + ", min: " + min);
    }

    public static void main(String[] args) {
        int[] nums = {10, -6, 23, 0, -4};
        loop(nums);
    }
}
