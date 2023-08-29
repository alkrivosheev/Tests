package ru.job4j.loop;

public class Task78 {
    public static void loop(int[] days, int[] values ) {
        int sum = 0;
        int chillThu = 0;
        for (int i = 0; i < days.length; i++) {
            if (values[i] >= 7) {
                sum++;
            }
            if (days[i] == 2 && values[i] <= 5) {
                chillThu++;
            }
        }
        System.out.println("Опасно: " + sum + ", спокойный вторник: " + chillThu);
    }

    public static void main(String[] args) {
        int[] days = {1, 2, 3, 4};
        int[] values = {1, 5, 7, 9};
        loop(days, values);
    }
}
