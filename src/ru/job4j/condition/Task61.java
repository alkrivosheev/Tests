package ru.job4j.condition;

public class Task61 {
    public static void hasEqualDigits(int number) {
        int num1, num2, num3;
        num1 = number % 10;
        num2 = (number / 10) % 10;
        num3 = (number / 100) % 10;
        if (num1 < num2 && num2 < num3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        hasEqualDigits(156);
    }
}
