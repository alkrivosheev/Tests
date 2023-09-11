package ru.job4j.loop;

public class Task119 {
    public static void loop(int num, int digit) {
        int count = 0;
        String stNum = String.valueOf(num);
        for (int i = 0; i < stNum.length(); i++ ) {
            int intgr = Integer.valueOf(String.valueOf(stNum.charAt(i)));
            if (intgr == digit) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    public static void main(String[] args) {
        loop(235, 2);
    }
}
