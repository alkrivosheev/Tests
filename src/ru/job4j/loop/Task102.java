package ru.job4j.loop;

public class Task102 {
    public static void loop(int[] num) {
        int max = 0;
        int min = 0;
        for (int n : num) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        if (min >= 0) {
            System.out.println("Max: " + max + ", min: Нет");
        } else if (max <= 0) {
            System.out.println("Max: Нет" + ", min: " + min);
        } else {
            System.out.println("Max: " + max + ", min: " + min);
        }
    }
        public static void main(String[] args) {
            int[] nums = {0, 1, 2, 3, 4};
            loop(nums);
        }
}
