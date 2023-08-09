package ru.job4j.condition;

public class Task76 {
    public static void sameNumAmount(int num) {
        int n1 = num % 10;
        int n2 = (num / 10) % 10;
        int n3 = (num / 100) % 10;
        if (n1 == n2 && n2 == n3) {
            System.out.println(0);
        } else if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }

    public static void main(String[] args) {
        sameNumAmount(331);
    }
}
