package ru.job4j.condition;

public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int dnum1 = num1 % 10;
        int dnum2 = num2 % 10;
        if (dnum1 == dnum2) {
            System.out.println("Одинаковые");
        } else {
            int res = dnum1 > dnum2 ? dnum1 : dnum2;
            System.out.println(res);
        }
    }
}
