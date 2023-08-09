package ru.job4j.condition;

public class Task74 {
    public static void innerNum(int num2, int num4) {
        String n1 = String.valueOf(num2);
        String n2 = String.valueOf(num4);
        if (n2.contains(n1)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

    }

    public static void main(String[] args) {
        innerNum(24, 1534);
    }
}
