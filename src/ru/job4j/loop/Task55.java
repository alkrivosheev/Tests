package ru.job4j.loop;

public class Task55 {
    public static void loop(int[] array) {
        int countc = 0;
        int countnc = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                countc++;
            }else {
                countnc++;
            }
        }
        System.out.println("Четных: " + countc + ", нечетных: " + countnc);
    }

    public static void main(String[] args) {
        int[] rsl = {2, -2, -1};
        loop(rsl);
    }
}
