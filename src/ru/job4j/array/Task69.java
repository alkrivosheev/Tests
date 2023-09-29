package ru.job4j.array;

import java.util.StringJoiner;

public class Task69 {
    public static void array(int[] arr) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            joiner.add(String.valueOf(arr[i]));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 0};
        array(arr);
    }
}
