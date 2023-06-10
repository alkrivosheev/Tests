package ru.job4j.dataType;

public class Task18 {
    public static int capSum(int tens, int hundreds, int thousands) {
        int sum =10 * tens + 100 * hundreds + 1000 * thousands;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(capSum(1, 2, 3));
    }
}
