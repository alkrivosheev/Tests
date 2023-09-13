package ru.job4j.loop;

public class Task136 {
    public static void loop(int num) {
        int summ = (int) Math.sqrt(num);
        if (Math.pow(summ, 2) == num) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(17);
    }
}
