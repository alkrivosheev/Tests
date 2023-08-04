package ru.job4j.condition;

public class Task25 {
    public static void isPositive(int number) {
        String msg = number >= 0 ? "Да" : "Нет";
        System.out.println(msg);
    }
}
