package ru.job4j.loop;

public class Task103 {
    public static void loop(int[] num) {
        int min = (num[0] % 10) + ((num[0] / 10) % 10) + ((num[0] / 100) % 10);
        int number = num[0];
        for (int n : num) {
            int tmp = (n % 10) + ((n / 10) % 10) + ((n / 100) % 10);
            if (min > tmp) {
                min = tmp;
                number = n;
            }
        }
        System.out.println(number);
    }

    public static void main(String[] args) {
        int[] nums = {100, 101, 200};
        loop(nums);
    }
}
