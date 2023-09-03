package ru.job4j.loop;

public class Task106 {
    public static void loop(int[] nums) {
        for (int n : nums) {
            if (n == 0) {
                break;
            }
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        int[] n = {-5, 2, 40, 0, 19};
        loop(n);
    }
}
