package ru.job4j.other;

public class SplitToString {
    public static void main(String[] args) {
        String input = "10. Task.";
        String[] words;
//        words = input.split(". ", 2);
        int rsl = Integer.parseInt(input.split(". " ,2)[0]);
//        int rsl = Integer.parseInt(words[0]);
        System.out.println(rsl);
    }
}
