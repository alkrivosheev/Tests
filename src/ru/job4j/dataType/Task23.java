package ru.job4j.dataType;

public class Task23 {
    public static void separate(int number) {
        int num1, num2, num3;
        num1 = number % 10;
        num2 = (number / 10) % 10;
        num3 = (number / 100) % 10;
        System.out.println(num1 + " " + num2 + " " + num3);
    }

    public static void main(String[] args) {
        separate(205);
    }
}
