package ru.job4j.condition;

public class Task21 {
    public static void signCheck(int number1, int number2) {
        if (number1 == 0 || number2 == 0 ) {
            System.out.println("Некорректно");
        } else if ((number1 + Math.abs(number1) == 0 && number2 + Math.abs(number2) != 0) || (number1 + Math.abs(number1) != 0 && number2 + Math.abs(number2) == 0)) {
            System.out.println("Разные");
        } else {
            System.out.println("Одинаковые");
        }
    }

    public static void main(String[] args) {
        Task21.signCheck(1, -2);
    }
}
