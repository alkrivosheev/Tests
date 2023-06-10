package ru.job4j.dataType;

public class Task35 {
    public static void firstLastChange(int number) {
        int num1, num2, num3;
        num1 = number % 10;
        num2 = (number / 10) % 10;
        num3 = (number / 100) % 10;
        int res = num1 * 100 + num2 * 10 + num3;
        System.out.println(res);
    }

    public static void main(String[] args) {
        firstLastChange(100);
    }
}
