package ru.job4j.loop;

public class Task62 {
    public static void loop(int amount, int[] grades) {
        int countc = 0;
        for (int num : grades) {
            if (num < 3) {
                countc++;
            }
        }
        if (countc > amount / 2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        int[] rsl = {2, 1, 3, 5};
        loop(4, rsl);
    }
}
