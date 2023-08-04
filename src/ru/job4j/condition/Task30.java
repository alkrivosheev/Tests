package ru.job4j.condition;

public class Task30 {
    public static void numModify(int number) {
        int rsl = number;
        if (number < 0) {
            rsl = Math.abs(number);
        } else if (number > 0) {
            rsl = 0;
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        numModify(0);
    }
}
