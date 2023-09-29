package ru.job4j.array;

import java.util.StringJoiner;

public class Task68 {
    public static void array(int[] arr) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            joiner.add(String.valueOf(arr[i]));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 0};
        array(arr);
    }
}
