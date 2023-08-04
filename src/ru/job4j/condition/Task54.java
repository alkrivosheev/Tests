package ru.job4j.condition;

public class Task54 {
    public static void transform(int number) {
        int k;
        int num1 = Math.abs(number % 10);
        int num2 = Math.abs((number / 10) % 10);
        int num3 = Math.abs((number / 100) % 10);
        if (number % 2 == 0) {
             k = num1 % 2 == 0 ? 1 : -1; if (k == 1) {num1 += num1 == 9 ? 0 : k;} else {num1 += num1 == 0 ? 0 : k;}
             k = num2 % 2 == 0 ? 1 : -1; if (k == 1) {num2 += num2 == 9 ? 0 : k;} else {num2 += num2 == 0 ? 0 : k;}
             k = num3 % 2 == 0 ? 1 : -1; if (k == 1) {num3 += num3 == 9 ? 0 : k;} else {num3 += num3 == 0 ? 0 : k;}
        } else {
            k = num1 % 2 == 0 ? -1 : 1; if (k == 1) {num1 += num1 == 9 ? 0 : k;} else {num1 += num1 == 0 ? 0 : k;}
            k = num2 % 2 == 0 ? -1 : 1; if (k == 1) {num2 += num2 == 9 ? 0 : k;} else {num2 += num2 == 0 ? 0 : k;}
            k = num3 % 2 == 0 ? -1 : 1; if (k == 1) {num3 += num3 == 9 ? 0 : k;} else {num3 += num3 == 0 ? 0 : k;}
        }
        if (number > 0) {
            System.out.println(num3 * 100 + num2 * 10 + num1);
        } else {
            System.out.println((num3 * 100 + num2 * 10 + num1) * - 1);
        }
    }

    public static void main(String[] args) {
        transform(100);
    }
}
