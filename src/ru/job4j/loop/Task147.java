package ru.job4j.loop;

public class Task147 {
    public static void loop(int num, int[] tickets) {
        int success = 0;
        int bad = 0;
        int summ = 0;
        for (int n : tickets) {
            summ += n;
            if (summ <= num) {
                success++;
            } else {
                bad++;
            }
        }
        System.out.println("Покупатели: " + success + ", отказано: " + bad);
    }

    public static void main(String[] args) {
        int[] tickets = {2, 9, 9, 7, 2, 2, 1};
        loop(10, tickets);
    }
}
