package ru.job4j.loop;

public class Task130 {
    public static void loop(int num) {
        String stNum = String.valueOf(num);
        int count = 0;
        for (int i = 0; i < stNum.length(); i++ ) {
            int intgr = Integer.valueOf(String.valueOf(stNum.charAt(i)));
            if (intgr == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        loop(2020);
    }
}
