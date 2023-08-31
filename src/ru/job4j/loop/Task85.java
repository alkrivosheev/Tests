package ru.job4j.loop;

public class Task85 {
    public static void loop(int money, int percent, int months) {
        double sum = money;
        for (int i = 1; i <= months; i++) {
            sum += (sum / 100) * percent;
        }

        System.out.printf("%.2f", sum);
        System.out.println();
    }

    public static void main(String[] args) {
        loop(10000, 5, 2);
    }

}
