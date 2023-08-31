package ru.job4j.loop;

public class Task87 {
    public static void loop() {
        int sum = 0;
        for (int i = 10; i <= 70 ; i++) {
            sum = (i % 10) + ((i / 10) % 10);
            if ( sum * sum * sum == i * i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        loop();
    }
}
