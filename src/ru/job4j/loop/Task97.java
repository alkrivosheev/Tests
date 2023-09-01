package ru.job4j.loop;

public class Task97 {
    public static void loop(int[] num) {
        int min = num[0];
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
                index = i;
            }
        }
        System.out.println("Время: " + min + ", номер: " + index);
    }

    public static void main(String[] args) {
        int[] time = {21, 23, 27, 19, 22};
        loop(time);
    }
}
