package ru.job4j.loop;

public class Task64 {
    public static void loop(int[] months) {
        int winter = 0;
        int spring = 0;
        int summer = 0;
        int fall = 0;
        for (int num : months) {
            switch (num) {
                case 12, 1, 2 :
                    winter++;
                    break;
                case 3, 4, 5 :
                    spring++;
                    break;
                case 6, 7, 8 :
                    summer++;
                    break;
                case 9, 10, 11 :
                    fall++;
                    break;
            }
        }
        System.out.println("Зимой: " + winter + ", Весной: " + spring + ", Летом: " + summer + ", Осенью: " + fall);
    }

    public static void main(String[] args) {
        int[] rsl = {1, 5, 9, 9, 2, 3, 11};
        loop(rsl);
    }
}
