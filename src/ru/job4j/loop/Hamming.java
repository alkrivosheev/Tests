package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int rsl = 0;
        char[] charsLeft = left.toCharArray();
        char[] charsRight = right.toCharArray();
        for (int i = 0; i < charsLeft.length; i++) {
            if (!String.valueOf(charsLeft[i]).equals(String.valueOf(charsRight[i]))) {
                rsl++;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkStrings("101010111" ,"111010100"));
    }
}
