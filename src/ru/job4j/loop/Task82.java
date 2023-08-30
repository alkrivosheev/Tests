package ru.job4j.loop;

public class Task82 {
    public static void loop(int[] promo, int[] concert) {
        int sum = 0, freeSum = 0;
        for (int i = 0; i < promo.length; i++) {
            sum += promo[i] + concert[i];
            if (promo[i] >= 10) {
                freeSum += promo[i] / 10 % 10;
            }
        }
        System.out.println("Продано билетов: " + sum + ", выдано бесплатно: " + freeSum);
    }

    public static void main(String[] args) {
        int[] promo = {21, 10, 2, 2};
        int[] concert = {1, 2, 5, 22};
        loop(promo, concert);
    }
}
