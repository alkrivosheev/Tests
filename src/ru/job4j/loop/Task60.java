package ru.job4j.loop;

public class Task60 {
    public static void loop() {
        int count = 0;
        int num1, num2;
        for (int i = 10; i <= 20;i++) {
            num1 = i % 10;
            num2 = i / 10 % 10;
            if (Math.abs(num1 - num2) <= 3) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        loop();
    }
}
