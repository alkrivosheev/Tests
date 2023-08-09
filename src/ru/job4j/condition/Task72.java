package ru.job4j.condition;

public class Task72 {
    public static void midDigitMore(int num) {
        int n1 = num % 10;
        int n2 = (num / 10) % 10;
        int n3 = (num / 100) % 10;
        if (n2 < n1 && n2 < n3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        midDigitMore(448);
    }
}
