package ru.job4j.loop;

public class Task140 {
    public static void loop(int num) {
        for (int i = num - 1 ; i >= 1; i--) {
            if (num % i == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        loop(30);
    }
}
