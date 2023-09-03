package ru.job4j.loop;

public class Task108 {
    public static void loop(int[] nums) {
        int summ = 0;
        for (int n : nums) {
            if (n == 999) {
                break;
            }
            summ += n;
            System.out.println(n);
        }
        System.out.println("Сумма: " + summ);
    }

    public static void main(String[] args) {
        int[] n = {-2, 3 , 999, 100, 20};
        loop(n);
    }
}
