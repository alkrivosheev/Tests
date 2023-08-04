package ru.job4j.condition;

public class Task34 {
    public static void chairsCheck(int pupils, int chairs) {
        if (pupils > chairs) {
            System.out.println("Не хватает стульев: " + (pupils - chairs));
        } else if (chairs > pupils) {
            System.out.println("Лишних стульев: " + (chairs - pupils));
        } else {
            System.out.println("Соответствует");
        }
    }

    public static void main(String[] args) {
        chairsCheck(12, 10);
    }
}
