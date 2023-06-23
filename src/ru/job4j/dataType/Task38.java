package ru.job4j.dataType;

public class Task38 {
    public static void leftShift(int number) {
        int num1, num2, num3;
        num1 = number % 10;
        num2 = (number / 10) % 10;
        num3 = (number / 100) % 10;
        int res = num3 * 1000 + num2 * 100 + num1 * 10;
        System.out.println(res);
    }

    public static void main(String[] args) {
        leftShift(1234);
    }
}
