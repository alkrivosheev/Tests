package ru.job4j.loop;

import java.util.Scanner;

public class Task169 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        for (int i = columnCount; i >= 1 ; i--) {
            System.out.print(star);
        }
    }
}
