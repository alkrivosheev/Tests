package ru.job4j.loop;

public class Task93 {
    public static void loop(int[] first, int[] second) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] + second[i] >= 80) {
                sum += first[i] + second[i];
                count++;
            }
        }
        System.out.println("В финале: " + count + ", сумма баллов: " + sum);
    }

    public static void main(String[] args) {
        int[] st1 = {30, 40, 45};
        int[] st2 = {50, 45, 20};
        loop(st1, st2);
    }
}
