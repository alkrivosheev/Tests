package ru.job4j.condition;

public class Task55 {
    public static void apartmentPlace(int number) {
        int place = (int) Math.ceil((double) number / 3);
        System.out.println(place);
        int set = number - 3 * (place - 1);
        System.out.println(set);
    }

    public static void main(String[] args) {
        apartmentPlace(14);
    }
}
