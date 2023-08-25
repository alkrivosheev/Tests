package ru.job4j.loop;

public class Task54 {
    public static void loop(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] rsl = {2, -2, -1};
        loop(rsl);
    }
}
