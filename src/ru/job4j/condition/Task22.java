package ru.job4j.condition;

public class Task22 {
    public static void haveRoots(int a, int b, int c) {
        double d = (b * b) - (4 * a * c);
        if (d < 0) {
            System.out.println("Нет");
        } else {
            System.out.println("Да");
        }
    }

    public static void main(String[] args) {
        haveRoots(1, -1, -6);
    }
}
