package ru.job4j.loop;

public class Task118 {
    public static void loop(int num) {
        int summ = 0;
        int count = 0;
        String stNum = String.valueOf(num);
        for (int i = 0; i < stNum.length(); i++ ) {
            int intgr = Integer.valueOf(String.valueOf(stNum.charAt(i)));
            if (intgr % 2 == 0) {
                count++;
            } else {
               summ += intgr;
            }
        }
        System.out.println("Количество чет: " + count + ", сумма нечет: " + summ);
    }

    public static void main(String[] args) {
        loop(2235);
    }
}
