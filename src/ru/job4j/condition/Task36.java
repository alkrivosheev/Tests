package ru.job4j.condition;

public class Task36 {
    public static void sameNums(int number) {
        int num1 = number % 10;
        int num2 = (number / 10) % 10;
        if (num2 == num1) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
