package ru.job4j.condition;

public class Task59 {
    public static void getLinearEquation(int a, int b) {
        double x;
        if (a == 0 && b == 0) {
            System.out.println("Бесконечное множество");
        } else if (a == 0 || b == 0) {
            System.out.println("Нет решения");
        }else {
            x = (double) (-1 * b) / a;
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        getLinearEquation(4, 6);
    }
}
