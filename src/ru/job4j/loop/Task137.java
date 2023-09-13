package ru.job4j.loop;

public class Task137 {
    public static void loop(int num) {
        for (int i = 10; i <= 99; i++) {
            if (((i % 10) + (i / 10 % 10)) == num) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        loop(9);
    }
}
