package ru.job4j.dataType;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dollars = input.nextInt();
        double transferRate = input.nextDouble();
        double rslCurrency = (double) dollars * transferRate;
        System.out.printf("%.2f", rslCurrency);
    }
}
