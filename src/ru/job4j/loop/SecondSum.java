package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int sum = 0;
        boolean key = true;
        for (int i = a; i <= b; i++) {
            if (key) {
                sum += i;
                key = false;
            } else {
                key = true;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 3));
    }
}
