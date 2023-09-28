package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String stNum = String.valueOf(i);
        for (int j = 0; j < stNum.length(); j++) {
            int intgr = Integer.valueOf(String.valueOf(stNum.charAt(j)));
            int intgrLast = Integer.valueOf(String.valueOf(stNum.charAt(stNum.length() - 1 -j)));
            if (intgr != intgrLast) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check(1321));
    }
}
