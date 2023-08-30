package ru.job4j.loop;

public class Task84 {
    public static void loop(int a1, int a2, int num) {
        int sum = a1 + a2;
        int actual1 = a1;
        int actual2 = a2;
        int next;
        int count = 3;
        while (count <= num) {
                next = actual1 + actual2;
                actual1 = actual2;
                actual2 = next;
                sum += next;
            count++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        loop(2, 3, 4);
    }
}
