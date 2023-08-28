package ru.job4j.loop;

public class Task63 {
    public static void loop(int[] answers) {
        int count = 0;
        for (int num : answers) {
            if (num ==1) {
                count++;
            }
        }
        if (count > answers.length / 2) {
            System.out.println(count + ", Да");
        } else {
            System.out.println(count + ", Нет");
        }
    }

    public static void main(String[] args) {
        int[] rsl = {1, 1, 1, 0, 0, 0};
        loop(rsl);
    }
}
