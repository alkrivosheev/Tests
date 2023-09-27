package ru.job4j.loop;

public class Task160 {
    public static void loop(int num) {
        int summNum = 0;
        for (int j = 1; j < num; j++) {
            if (num % j == 0) {
                summNum += j;
            }
        }
        System.out.println(summNum);
    }

    public static void main(String[] args) {
        loop(1184);
    }
}
