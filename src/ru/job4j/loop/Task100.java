package ru.job4j.loop;

public class Task100 {
    public static void loop(int[] num) {
        int max = 0;
        int maxNum = 0;
        for (int time : num) {
            if (max < (time % 10) + ((time / 10) % 10)) {
                max = (time % 10) + ((time / 10) % 10);
                maxNum = time;
            }
        }
        System.out.println(maxNum);
    }

    public static void main(String[] args) {
        int[] time = {24, 35, 19};
        loop(time);
    }
}
