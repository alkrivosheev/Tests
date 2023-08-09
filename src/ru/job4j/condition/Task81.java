package ru.job4j.condition;

public class Task81 {
    public static void isLatin(char s) {
//        if (s < 97 || s > 122) {
//            System.out.println("Нет");
//        } else System.out.println("Да");
        if (Character.isAlphabetic(s)) {
            System.out.println("Да");
        } else System.out.println("Нет");
    }

    public static void main(String[] args) {
        isLatin('R');
    }
}
