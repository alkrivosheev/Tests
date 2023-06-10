package ru.job4j.dataType;

public class Task31 {
    public static void difference(int number) {
        int num1, num2, num3;
        num1 = number % 10;
        num2 = (number / 10) % 10;
        num3 = (number / 100) % 10;
        System.out.println(Math.abs(num1 - num3) * num2);
    }

    public static void main(String[] args) {
        difference(235);
    }
}
