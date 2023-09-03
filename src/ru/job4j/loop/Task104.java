package ru.job4j.loop;

public class Task104 {
    public static void loop(int[] num) {
        int index = 0;
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                index = i;
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        int[] n = {101, 303, 909, 505, 707};
        loop(n);
    }
}
