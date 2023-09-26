package ru.job4j.loop;

import java.util.StringJoiner;

public class Task152 {
    public static void loop() {
        StringJoiner joiner1 = new StringJoiner(" ");
        StringJoiner joiner2 = new StringJoiner(" ");
        StringJoiner joiner3 = new StringJoiner(" ");
        for (int i = 10; i <= 20; i++) {
            if (i % 2 == 0) {
                joiner1.add(String.valueOf(i));
            }
            if (i % 3 == 0) {
                joiner2.add(String.valueOf(i));
            }
            if (i % 4 == 0) {
                joiner3.add(String.valueOf(i));
            }
        }
        System.out.println(joiner1);
        System.out.println(joiner2);
        System.out.println(joiner3);
    }

    public static void main(String[] args) {
        loop();
    }
}
