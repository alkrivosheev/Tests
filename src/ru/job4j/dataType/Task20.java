package ru.job4j.dataType;

public class Task20 {
    public static void separate(int number) {
        int num1, num2;
        num1 = number / 10;
        num2 = number % 10;
        System.out.println(num1 + " " + num2);
    }

    public static void main(String[] args) {
        separate(45);
    }
}
