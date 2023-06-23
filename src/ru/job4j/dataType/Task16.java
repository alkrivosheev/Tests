package ru.job4j.dataType;

public class Task16 {
    public static void decreaseBy2(int number) {
        int a, b, c;
        a = number - 1;
        b = a - 1;
        c = b - 1;
        System.out.println(a + "\n" + b + "\n" + c);
    }

    public static void main(String[] args) {
        decreaseBy2(6);
    }
}
