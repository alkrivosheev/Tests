package ru.job4j.dataType;

public class Task42 {
    public static void rightCircleShift(int number) {
        int num1, num2, num3, num4;
        num1 = number % 10;
        num2 = (number / 10) % 10;
        num3 = (number / 100) % 10;
        num4 = (number / 1000) % 10;
        int res = num1 * 1000 + num4 * 100 + num3 * 10 + num2;
        System.out.println(res);
    }

    public static void main(String[] args) {
        rightCircleShift(1234);
    }
}
