package ru.job4j.loop;

public class Task76 {
    public static void loop(int num1, int num2) {
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                for (int j = 1; j <= num2; j++) {
                    if (i == j && num2 % j == 0) {
                        sum += j;
                        break;
                    }
                }
            }
        }
        if (sum % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(12, 24);
    }
}
