package ru.job4j.dataType;

public class Task45 {
    public static void leftNumChange(int number1, int number2) {
        int left1, right1, left2, right2, res1, res2;
        right1 = number1 % 100;
        right2 = number2 % 100;
        left1 = number1 / 100;
        left2 = number2 / 100;
        res1 = left2 * 100 + right1;
        res2 = left1 * 100 + right2;
        System.out.println(res1);
        System.out.println(res2);
    }

    public static void main(String[] args) {
        leftNumChange(123, 456);
    }
}
