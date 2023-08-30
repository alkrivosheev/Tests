package ru.job4j.loop;

public class Task81 {
    public static void loop(int num) {
        int n1, n2, sum = 0;
        n1 = num % 10;
        n2 = num / 10 % 10;
        if (n2 < n1) {
            n1 = n2;
            n2 = num % 10;
        }
        for (int i = n1; i <= n2 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(52);
    }
}
