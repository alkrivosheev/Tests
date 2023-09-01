package ru.job4j.loop;

public class Task98 {
    public static void loop(int[] num) {
        int min = num[0];
        int max = num[0];
        for (int time : num) {
            min = Math.min(time, min);
            max = Math.max(time, max);
        }
        System.out.println((min + max) / 2);
    }

    public static void main(String[] args) {
        int[] time = {4, 1, 2, 9, 6};
        loop(time);
    }
}
