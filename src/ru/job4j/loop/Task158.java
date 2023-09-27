package ru.job4j.loop;

public class Task158 {
    public static void loop(int num) {
        String res = "Нет";
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num; j++) {
                if (i * i + j * j == num) {
                    res = "Да";
                    break;
                }
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        loop(25);
    }
}
