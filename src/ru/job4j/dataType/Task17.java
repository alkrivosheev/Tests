package ru.job4j.dataType;

public class Task17 {
    public static void calculate(int base, int height) {
        double area = (double) (base * height) / 2;
        double perimeter = (base + height) * 2;
        System.out.printf("%.1f%n%.1f", area, perimeter);
    }

    public static void main(String[] args) {
        calculate(5, 4);
    }
}
