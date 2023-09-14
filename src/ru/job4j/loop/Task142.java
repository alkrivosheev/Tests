package ru.job4j.loop;

public class Task142 {
    public static void loop(int num) {
        boolean res = false;
        int[] f = new int[100];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 100; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int n : f) {
            if (n == num) {
                res = true;
                break;
            }
        }
        System.out.println((res) ? "Да" : "Нет");
    }

    public static void main(String[] args) {
        loop(2);
    }
}
