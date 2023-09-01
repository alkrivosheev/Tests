package ru.job4j.loop;

public class Task96 {
    public static void loop(int[] num) {
        int min = num[0];
        for (int time : num) {
            min = Math.min(time, min);
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] time = {21, 23, 27, 19, 22};
        loop(time);
    }
}
