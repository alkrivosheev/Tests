package ru.job4j.loop;

public class Task116 {
    public static void loop(int num) {
        int summ = 0;
        String stNum = String.valueOf(num);
        for (int i = 0; i < stNum.length(); i++ ) {
            int intgr = Integer.valueOf(String.valueOf(stNum.charAt(i)));
            summ += intgr;
        }
        System.out.println("Количество: " + stNum.length() + ", сумма: " + summ);
    }

    public static void main(String[] args) {
        loop(222);
    }
}
