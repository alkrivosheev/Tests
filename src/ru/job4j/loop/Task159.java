package ru.job4j.loop;

public class Task159 {
    public static void loop() {
        int max = 0;
        int index = 0;
        for (int i = 1; i < 10000; i++) {
            int summ = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    summ += j;
                }
            }
            if (max < summ) {
                max = summ;
                index = i;
            }
        }
        System.out.println(index);
    }

    public static void main(String[] args) {
        loop();
    }
}
