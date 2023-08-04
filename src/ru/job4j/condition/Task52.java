package ru.job4j.condition;

public class Task52 {
    public static void isEquals(int a1, int a2, int b1, int b2) {
        if ((double)a1 / b1 == (double)a2 / b2 || (double)b1 / a1 == (double)b2 / a2) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isEquals(2, 7, 3, 8);
    }
}
