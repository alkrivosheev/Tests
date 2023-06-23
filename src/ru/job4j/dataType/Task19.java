package ru.job4j.dataType;

public class Task19 {
    public static void sumAndConvert(double money, double gift, double ratio) {
        double euro = (money + gift) * ratio;
        System.out.printf("%.2f", euro);
    }

    public static void main(String[] args) {
        sumAndConvert(5000, 7000, 0.016516);
    }
}
