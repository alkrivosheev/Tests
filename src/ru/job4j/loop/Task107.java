package ru.job4j.loop;

public class Task107 {
    public static void loop(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n == 999) {
                break;
            }
            count++;
            System.out.println(n);
        }
        System.out.println("Значений: " + count);
    }

    public static void main(String[] args) {
        int[] n = {1, 50, 100, 999, 1000};
        loop(n);
    }
}
