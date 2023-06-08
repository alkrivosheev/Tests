package ru.job4j.strings;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        double p;
        double l;
        double s;
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        p = a * 4;
        l = 2 * Math.PI * r;
        s = Math.PI * Math.pow(r, 2);
        System.out.println(String.format("%.1f", p));
        System.out.println(String.format("%.1f", l));
        System.out.println(String.format("%.1f", s));
    }
}
