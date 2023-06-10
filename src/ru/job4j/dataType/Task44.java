package ru.job4j.dataType;

public class Task44 {
    public static void rightNumChange(int number1, int number2) {
        int left1, right1, left2, right2, res1, res2;
        right1 = number1 % 10;
        right2 = number2 % 10;
        left1 = number1 / 10;
        left2 = number2 / 10;
        res1 = left1 * 10 + right2;
        res2 = left2 * 10 + right1;
        System.out.println(res1);
        System.out.println(res2);
    }

    public static void main(String[] args) {
        rightNumChange(123, 4567);
    }
}
