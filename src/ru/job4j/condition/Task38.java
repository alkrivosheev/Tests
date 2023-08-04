package ru.job4j.condition;

public class Task38 {
    public static void maxDigit(int number) {
        int num1 = number % 10;
        int num2 = (number / 10) % 10;
        int num3 = (number / 100) % 10;
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
