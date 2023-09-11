package ru.job4j.loop;

public class Task117 {
    public static void loop(int num) {
        int summ = 0;
        int count = 0;
        String stNum = String.valueOf(num);
        for (int i = 0; i < stNum.length(); i++ ) {
            int intgr = Integer.valueOf(String.valueOf(stNum.charAt(i)));
            if (intgr % 2 == 0) {
                summ += intgr;
                count++;
            }
        }
        System.out.println("Количество: " + count + ", сумма: " + summ);
    }

    public static void main(String[] args) {
        loop(223);
    }
}
