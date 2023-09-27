package ru.job4j.loop;

import java.util.StringJoiner;

public class Task167 {
    public static void loop(int[] first, int[] second, int[] third) {
        double avg = 0;
        double avg2 = 0;
        double avg3 = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        StringJoiner joiner1 = new StringJoiner(" ");
        StringJoiner joiner2 = new StringJoiner(" ");
        StringJoiner joiner3 = new StringJoiner(" ");
        for (int i = 0; i < first.length; i++) {
            sum1 += first[i];
            joiner1.add(String.valueOf(first[i]));
            sum2 += second[i];
            joiner2.add(String.valueOf(second[i]));
            sum3 += third[i];
            joiner3.add(String.valueOf(third[i]));
        }
        avg = (double) sum1 / first.length;
        avg2 = (double) sum2 / second.length;
        avg3 = (double) sum3 / third.length;
        System.out.println("Оценки: " + joiner1 + ", средняя: " + avg);
        System.out.println("Оценки: " + joiner2 + ", средняя: " + avg2);
        System.out.println("Оценки: " + joiner3 + ", средняя: " + avg3);
        int count = 0;
        if (avg > 4.5) {
            count++;
        }
        if (avg2 > 4.5) {
            count++;
        }
        if (avg3 > 4.5) {
            count++;
        }
        double max = Math.max(avg, Math.max(avg2, avg3));
        System.out.println("Выше 4.5: " + count + ", наивысшая: " + max);
    }

    public static void main(String[] args) {
        int[] st1 = {5, 4, 3, 5, 5};
        int[] st2 = {2, 4, 3, 5, 4};
        int[] st3 = {5, 5, 5, 4, 5};
        loop(st1, st2, st3);
    }
}
