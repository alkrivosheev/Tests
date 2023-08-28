package ru.job4j.loop;

public class Task69 {
    public static void loop(int num1, int num2) {
        int count = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                for (int j = 1; j <= num2; j++) {
                    if (num2 % i == 0 && num2 % j == 0) {
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        loop(4, 8);
    }
}
