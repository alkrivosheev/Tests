package ru.job4j.loop;

import java.util.StringJoiner;

public class Task91 {
    public static void loop(int n1, int n2, int n3) {
        StringJoiner joiner = new StringJoiner(" ");
        if (n2 - n1 == n3 - n2) {
            for (int i = n3 + (n3 - n2); i <= n3 + (n3 - n2) * 3; i += n2 - n1) {
                joiner.add(String.valueOf(i));
            }
            System.out.println(joiner);
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(2, 4, 6);
    }
}
