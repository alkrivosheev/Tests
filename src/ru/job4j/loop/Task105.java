package ru.job4j.loop;

public class Task105 {
    public static void loop(int[] num) {
        int index = 0;
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            int tmp = (num[i] % 10) + ((num[i] / 10) % 10) + ((num[i] / 100) % 10);
            if (max < tmp) {
                max = tmp;
                index = i;
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        int[] n = {194, 999, 562};
        loop(n);
    }
}
