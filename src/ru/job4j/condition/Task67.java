package ru.job4j.condition;

public class Task67 {
    public static void isTriangle(int a, int b) {
        if (a == b) {
            System.out.println("Квадрат");
        } else {
            System.out.println("Прямоугольник");
        }
    }

    public static void main(String[] args) {
        isTriangle(2,  8);
    }
}
