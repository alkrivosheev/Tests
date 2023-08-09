package ru.job4j.condition;

public class Task71 {
    public static void change(int money) {
        if (money % 10 == 0) {
            int hundreds = 0;
            while (money >= 100) {
                money -= 100;
                hundreds ++;
            }
            int fifteens = 0;
            while (money >= 50) {
                money -= 50;
                fifteens ++;
            }
            int tens = 0;
            while (money >= 10) {
                money -= 10;
                tens ++;
            }
            System.out.println("100: " + hundreds + ", 50: " + fifteens + ", 10: " + tens);
        } else {
            System.out.println("Нельзя");
        }
    }

    public static void main(String[] args) {
        change(150);
    }
}
