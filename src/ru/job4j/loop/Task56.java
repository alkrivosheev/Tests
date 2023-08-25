package ru.job4j.loop;

public class Task56 {
    public static void loop(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num > array[0]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] rsl = {3, 1, 4, 2, 3};
        loop(rsl);
    }
}
