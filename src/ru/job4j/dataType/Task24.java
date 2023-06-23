package ru.job4j.dataType;

public class Task24 {
    public static void separate(int number) {
        int num1, num2;
        num1 = number % 10;
        num2 = (number / 10) % 10 * 10;
        System.out.println(num2 + "+" + num1);
    }

    public static void main(String[] args) {
        separate(25);
    }
}
