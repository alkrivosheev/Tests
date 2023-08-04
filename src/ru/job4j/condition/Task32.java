package ru.job4j.condition;

public class Task32 {
    public static void calculate(int num1, int num2) {
        int rsl = num1 * num2;
        if (num1 > num2) {
            rsl = num1 - num2;
        } else if (num2 > num1) {
            rsl = num2 - num1;
        }
        System.out.println(rsl);
    }
}
