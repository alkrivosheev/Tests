package ru.job4j.dataType;

public class Task36 {
    public static void firstLastChange(int number) {
        int first, middle, last, num1, num2, num3, num4;
        num1 = number % 10;
        num2 = (number / 10) % 10;
        num3 = (number / 100) % 10;
        num4 = (number / 1000) % 10;
        first = num1 * 1000;
        middle = num3 * 100 + num2 * 10;
        last = num4;
        int res = first + middle + last;
        System.out.println(res);
    }

    public static void main(String[] args) {
        firstLastChange(4265);
    }
}
