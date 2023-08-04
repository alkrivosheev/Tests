package ru.job4j.dataType;

public class Task39 {
    public static void leftCircleShift(int number) {
        int num1;
        int res = 0;
        num1 = number % 10;
        if (num1 == 0) {
            System.out.println("Без изменений");
        } else if (number % 2 == 0) {
            res = number + (10 - num1);
            System.out.println("Увеличено до " + res);
        }else {
            res = number - num1;
            System.out.println("Уменьшено до " + res);
        }
    }

    public static void main(String[] args) {
        leftCircleShift(122);
    }
}
