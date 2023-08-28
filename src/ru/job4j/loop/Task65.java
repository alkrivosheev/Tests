package ru.job4j.loop;

public class Task65 {
    public static void loop(int[] nums) {
        int rsl = 0;
        for (int num : nums) {
            if (num > 0) {
                rsl++;
            } else if (num < 0) {
                rsl--;
            }
        }
        if (rsl == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

    }

    public static void main(String[] args) {
        int[] rsl = {-2, 0, 1, -3, 2};
        loop(rsl);
    }
}
