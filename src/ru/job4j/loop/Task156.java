package ru.job4j.loop;

public class Task156 {
    public static void loop(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        loop(4);
    }
}
