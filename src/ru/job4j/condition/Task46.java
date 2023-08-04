package ru.job4j.condition;

public class Task46 {
    public static void changeNums(int num1, double num2, int num3) {
      double rsl = 0;
        if (num1 % 2 == 0) {
          rsl = (double) num1 * num2;
      } else {
            rsl = (double) num2 * num3;
        }
        System.out.println(rsl);
    }

    public static void main(String[] args) {
        changeNums(3, 3.5, 4);
    }
}
