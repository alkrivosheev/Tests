package ru.job4j.loop;

public class Task79 {
    public static void loop(int[] grades) {
        double avg;
        int bad = 0;
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
           sum += grades[i];
           if (grades[i] <= 2) {
               bad++;
           }
        }
        avg = (double) sum / grades.length;
        System.out.println("Средняя оценка: " + avg + ", неуд. оценка: " + bad);
    }

    public static void main(String[] args) {
        int[] grades = {3, 4, 2, 3, 5};
        loop(grades);
    }
}
