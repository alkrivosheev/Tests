package ru.job4j.dataType;

public class Task43 {
    public static void rightNumChange(int number1, int number2) {
        int num11, num12, num13, num21, num22, num23;
        num11 = number1 % 10;
        num12 = (number1 / 10) % 10;
        num13 = (number1 / 100) % 10;
        num21 = number2 % 10;
        num22 = (number2 / 10) % 10;
        num23 = (number2 / 100) % 10;
        int res1 = num13 * 100 + num12 * 10 + num21;
        int res2 = num23 * 100 + num22 * 10 + num11;
        System.out.println(res1);
        System.out.println(res2);
    }

    public static void main(String[] args) {
        rightNumChange(123, 456);
    }
}
