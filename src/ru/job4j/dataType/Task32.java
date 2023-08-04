package ru.job4j.dataType;

public class Task32 {
    public static void evenAmount(int number) {
        int num1, num2, num3;
        int rsl = 0;
        num1 = number % 10;
        num2 = (number / 10) % 10;
        num3 = (number /100) % 10;
        if (number > 500) {
            rsl = num1 * 100 + num2 * 10 + num3;
        } else {
            rsl = num3 * 100 + num1 * 10 + num2;
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        evenAmount(262);
    }
}
