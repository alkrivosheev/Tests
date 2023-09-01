package ru.job4j.loop;

public class Task95 {
    public static void loop(int[] math, int[] info) {
        int count = 0;
        int mathCount = 0;
        int infCount = 0;
        for (int i = 0; i < math.length; i++) {
            if ((math[i] + info[i]) / 2 >= 7) {
                count++;
                if (math[i] > info[i]) {
                    mathCount++;
                } else {
                    infCount++;
                }
            }
        }
        System.out.println("Зачислено: " + count + ", ФМ: " + mathCount + ", ФИ: " + infCount);
    }

    public static void main(String[] args) {
        int[] math = {7, 9, 6, 2, 4};
        int[] inf = {7, 8, 9, 5, 6};
        loop(math, inf);
    }
}
