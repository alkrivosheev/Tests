package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        String strNum = String.valueOf(num);
        int length = strNum.length();
        for (int i = 0; i < length; i++) {
            char ch = strNum.charAt(i);
            int n = Character.getNumericValue(ch);
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
}
