package ru.job4j.condition;

public class Task58 {
    public static void isWinning(int number) {
        int sum1, sum2;
        sum1 = number / 100000 + ((number / 10000) % 10) + ((number / 1000) % 10);
        sum2 = ((number / 100) % 10) + ((number / 10) % 10) + number % 10;
        if (sum1 == sum2 && sum1 % 2 == 0 && sum2 % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        isWinning(145505);
    }
}
