package ru.job4j.loop;

public class Task143 {
    public static void loop(int num1, int num2) {
        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 < num2) ? num1 : num2;
        System.out.println(gcdByEuclidsAlgorithm(max, min));
    }
    public static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }

    public static void main(String[] args) {
        loop(15, 50);
    }
}
