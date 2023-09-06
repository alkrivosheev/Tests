package ru.job4j.loop;

public class Task113 {
    public static void loop(int[] first, int[] second) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                break;
            }
            sum1 += first[i];
            sum2 += second[i];
        }
        System.out.println("Сумма1: " + sum1 + ", сумма2: " + sum2);
    }

    public static void main(String[] args) {
        int[] ns1 = {2, 3, 4, 4, 6};
        int[] ns2 = {1, 2, 3, 4, 5};
        loop(ns1, ns2);
    }
}
