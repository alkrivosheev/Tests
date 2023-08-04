package ru.job4j.condition;

public class Task19 {
    public static void sumOrMultiply(int number1, int number2) {
        int sum = 0;
        if(number1 > number2) {
            sum = number1 + number2;
        } else if(number1 < number2) {
            sum = number1 * number2;
        } else {
            System.out.println("Числа равны");
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOrMultiply(3, 2);
    }
}