package ru.job4j.loop;

public class Task147 {
    public static void loop(int num, int[] tickets) {
        int success = 0;
        int bad = 0;
        int summ = 0;
        for (int n : tickets) {
            if (num - (summ + n) >= 0) {
                success++;
                summ += n;
            } else {
                bad++;
            }
        }
        if (success == 2) {
            bad = 0;
        } else if (success == 1) {
            bad = 3;
        }
        System.out.println("Покупатели: " + success + ", отказано: " + bad);
    }

    public static void main(String[] args) {
        int[] tickets = {8, 2, 1};
        loop(10, tickets);
    }
}
