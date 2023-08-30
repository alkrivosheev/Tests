package ru.job4j.loop;

public class Task80 {
    public static void loop(int[] grades) {
        double goodAvg = 0;
        double badAvg = 0;
        int sumGood = 0;
        int sumBad = 0;
        int good = 0;
        int bad = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 2) {
                good++;
                sumGood += grades[i];
            } else {
                bad++;
                sumBad += grades[i];
            }
        }
        goodAvg = sumGood != 0 ? ((double) sumGood / good) : 0;
        badAvg = sumBad != 0 ? ((double) sumBad / bad) : 0;

        System.out.println("Средняя удовл. оценка: " + goodAvg + ", средняя неуд. оценка: " + badAvg);
    }

    public static void main(String[] args) {
        int[] grades = {5, 4, 2, 3, 1};
        loop(grades);
    }
}
