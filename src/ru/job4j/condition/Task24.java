package ru.job4j.condition;

public class Task24 {
    public static void isPositive(int num1, int num2) {
        if ((num1 + Math.abs(num1) == 0 && num2 + Math.abs(num2) == 0) || (num1 + Math.abs(num1) != 0 && num2 + Math.abs(num2) != 0)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
