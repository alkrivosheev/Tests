package ru.job4j.loop;

public class Task153 {
    public static void loop() {
        int x;
        int y;
        for (int i = 0; i <= 10 ; i++) {
            x = i;
            y = (100 - (x * 10)) / 5;
            System.out.println("Быков: " + x + ", коров: " + y);
        }
    }

    public static void main(String[] args) {
        loop();
    }
}
