package ru.job4j.loop;

public class Task57 {
    public static void loop(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && array[i - 1] < array[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] rsl = {0,  2, 1, 1, 2};
        loop(rsl);
    }
}
