package ru.job4j.loop;

public class Task114 {
    public static void loop(int[] nums) {
        int summ = 0;
        int prev = 0;
        for (int num : nums) {
            if (prev == num) {
                break;
            }
            prev = num;
            summ += num;
        }
        System.out.println(summ);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 7};
        loop(arr);
    }
}
