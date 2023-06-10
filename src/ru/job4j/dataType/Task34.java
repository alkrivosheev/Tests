package ru.job4j.dataType;

public class Task34 {
    public static void evenAmount(int number) {
        int num1, num2, num3, num4, counter = 0;
        num1 = number % 10;
        counter += Math.abs(num1 % 2 - 1);
        num2 = (number / 10) % 10;
        counter += Math.abs(num2 % 2 - 1);
        num3 = (number / 100) % 10;
        counter += Math.abs(num3 % 2 - 1);
        num4 = (number / 1000) % 10;
        counter += Math.abs(num4 % 2 - 1);
        System.out.println(counter);

    }

    public static void main(String[] args) {
        evenAmount(4012);
    }
}
