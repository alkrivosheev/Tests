package ru.job4j.dataType;

public class Task40 {
    public static void leftCircleShift(int number) {
        int num1, num2, num3, num4;
        num1 = number % 10;
        num2 = (number / 10) % 10;
        num3 = (number / 100) % 10;
        num4 = (number / 1000) % 10;
        int res = num3 * 1000 + num2 * 100 + num1 * 10 + num4;
        System.out.println(res);
    }

    public static void main(String[] args) {
        leftCircleShift(1234);
    }
}
