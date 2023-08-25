package ru.job4j.loop;

public class Task59 {
    public static void loop(int num, int[] array) {
        int countc = 0;
        int countnc = 0;
        for (int anum : array) {
            if (num == anum) {
                countc++;
            }else if (anum < num) {
                countnc++;
            }
        }
        System.out.println("Равно: " + countc + ", меньше: " + countnc);
    }

    public static void main(String[] args) {
        int[] rsl = {0, 1, 2, 3};
        loop(2, rsl);
    }
}
