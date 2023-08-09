package ru.job4j.condition;

public class Task75 {
    public static void innerNum(int num2, int num4) {
        String n1 = String.valueOf(num2);
        String n2 = String.valueOf(num4);
        int count = 0;
        int index = n2.indexOf(n1);
        while (index != -1) {
            index = n2.indexOf(n1, index + 1);
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        innerNum(33, 3331);
    }
}
