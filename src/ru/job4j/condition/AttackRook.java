package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        String str1 = left.substring(0, 1);
        String str2 = right.substring(0, 1);
        String str3 = left.substring(1, 2);
        String str4 = right.substring(1, 2);

        return str1.equals(str2) || str3.equals(str4);
    }

    public static void main(String[] args) {
        System.out.println(check("A1", "B2"));
    }
}
