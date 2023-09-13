package ru.job4j.loop;

public class Task134 {
    public static void loop(int num) {
        int summ = 0;
        for (int i = 1; i <= num; i++) {
            if ((int) Math.pow(i, 2) + summ <= num) {
                summ += (int) Math.pow(i, 2);
            } else {
                break;
            }
        }
        System.out.println(summ);
    }

    public static void main(String[] args) {
        loop(1);
    }
}
