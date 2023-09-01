package ru.job4j.loop;

public class Task99 {
    public static void loop(int[] num) {
        int min = num[0];
        int max = num[0];
        int sum = 0;
        for (int time : num) {
            min = Math.min(time, min);
            max = Math.max(time, max);
            sum += time;
        }
        int avgSum = sum / num.length;
        int avgMinMax = (min + max) / 2;
        if (avgMinMax > avgSum) {
            System.out.println("Больше");
        }else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        int[] time = {10, 8, 5, 4, 2};
        loop(time);
    }
}
