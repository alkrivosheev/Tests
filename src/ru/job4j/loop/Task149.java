package ru.job4j.loop;

public class Task149 {
    public static void loop(int[] grades) {
        double avg;
        int summ = 0;
        int count = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] <= 5  && grades[i] >= 1) {
                summ += grades[i];
                count ++;
            } else {
                break;
            }
        }
        avg = (double) summ / count;
        System.out.println(String.format("%.2f", avg));
    }

    public static void main(String[] args) {
        int[] grades = {2, 5, 3, 5, 6, 3, 4};
        loop(grades);
    }
}
