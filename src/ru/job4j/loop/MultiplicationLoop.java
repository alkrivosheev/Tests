package ru.job4j.loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(mult(2, 7));
    }
}
