package ru.job4j.loop;

public class Task168 {
    public static void loop(int num1, int num2, int num3) {
        int numCount1 = 0;
        int sum1 = 0;
        int divCount = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                divCount++;
            }
        }
        String stNum = String.valueOf(num1);
        numCount1 = stNum.length();
        for (int i = 0; i < stNum.length(); i++ ) {
            int intgr = Integer.valueOf(String.valueOf(stNum.charAt(i)));
            sum1 += intgr;
        }
        System.out.println("Цифр: " + numCount1 + ", сумма цифр: " + sum1 + ", делителей: " + divCount);

        int numCount2 = 0;
        int sum2 = 0;
        int divCount2 = 0;
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                divCount2++;
            }
        }
        String stNum2 = String.valueOf(num2);
        numCount2 = stNum2.length();
        for (int i = 0; i < stNum2.length(); i++ ) {
            int intgr = Integer.valueOf(String.valueOf(stNum2.charAt(i)));
            sum2 += intgr;
        }
        System.out.println("Цифр: " + numCount2 + ", сумма цифр: " + sum2 + ", делителей: " + divCount2);

        int numCount3 = 0;
        int sum3 = 0;
        int divCount3 = 0;
        for (int i = 1; i <= num3; i++) {
            if (num3 % i == 0) {
                divCount3++;
            }
        }
        String stNum3 = String.valueOf(num3);
        numCount3 = stNum3.length();
        for (int i = 0; i < stNum3.length(); i++ ) {
            int intgr = Integer.valueOf(String.valueOf(stNum3.charAt(i)));
            sum3 += intgr;
        }
        System.out.println("Цифр: " + numCount3 + ", сумма цифр: " + sum3 + ", делителей: " + divCount3);

        System.out.println("Сумма всех цифр: " + (sum1 + sum2 + sum3));
    }

    public static void main(String[] args) {
        loop(10, 5, 212);
    }
}
