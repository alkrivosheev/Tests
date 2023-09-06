package ru.job4j.loop;

public class Task112 {
    public static void loop(int num, int[] nums) {
        int count = 0;
        int tmp = num;
        for (int n : nums) {
            if (tmp - n <= 0) {
                break;
            }
            tmp -= n;
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] ns = {1, 2, 3, 4, 5};
        loop(10, ns);
    }
}
