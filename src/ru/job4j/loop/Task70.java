package ru.job4j.loop;

public class Task70 {
    public static void loop(int x, int y, int r, int[] coords) {
        int in = 0;
        int on = 0;
        for (int i = 1; i < coords.length ; i += 2) {
            int pointX = coords[i - 1];
            int pointY = coords[i];
            int round = (pointX - x) * (pointX - x) + (pointY - y) * (pointY - y);
            if (round == r * r) {
                on++;
            }
            if (round < r * r) {
                in++;
            }
        }
        System.out.println("На окружности: " + on + ", внутри: " + in);
    }

    public static void main(String[] args) {
        int[] rsl = {0, 0, 1, 1, 2, 2};
        loop(0, 0, 3, rsl);
    }
}
