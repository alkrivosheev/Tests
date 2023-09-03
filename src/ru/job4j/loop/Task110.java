package ru.job4j.loop;

public class Task110 {
    public static void loop(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int n : nums) {
            if (sum + n < 150) {
                sum += n;
                count++;
            } else {
                break;
            }
        }
        System.out.println("Сумма: " + sum + ", количество: " + count);
    }

    public static void main(String[] args) {
        int[] n = {30, 40, 50, 60, 70};
        loop(n);
    }
}
