package ru.job4j.loop;

public class Task129 {
    public static void loop(int num) {
        String stNum = String.valueOf(num);
        int summ = 0;
        for (int i = 0; i < stNum.length(); i++ ) {
            int intgr = Integer.valueOf(String.valueOf(stNum.charAt(i)));
            summ += intgr;
        }
        System.out.println(summ);
    }

    public static void main(String[] args) {
        loop(353);
    }
}
