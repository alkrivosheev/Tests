package ru.job4j.loop;

import java.util.Scanner;

public class Task169 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        int count = columnCount;
        int spCount = 0;
        while (count > 1) {
            for (int i = 1; i <= spCount / 2; i++) {
                System.out.print(space);
            }
            for (int i = 1; i <= count; i++) {
                System.out.print(star);
            }
            System.out.println();
            count -= 2;
            spCount += 2;
        }
        while (count <= columnCount) {
            for (int i = 1; i <= spCount / 2; i++) {
                System.out.print(space);
            }
            for (int i = 1; i <= count; i++) {
                System.out.print(star);
            }
            System.out.println();
            count += 2;
            spCount -= 2;
        }
    }
}
