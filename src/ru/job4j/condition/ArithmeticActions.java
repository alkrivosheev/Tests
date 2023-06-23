package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        if (rsl - left == right){
            return "added";
        } else if (rsl + left == right || rsl + right == left) {
            return "subtracted";
        } else if (rsl * left == right || rsl * right == left) {
        return "divided";
        } else if (rsl / left == right) {
            return "multiplied";
        } else {
            return "none";
        }
    }

    public static void main(String[] args) {
        System.out.println(ArithmeticActions.selectAction(5, 10, 15));
        System.out.println(ArithmeticActions.selectAction(10, 5, 5));
        System.out.println(ArithmeticActions.selectAction(3, 5, 15));
        System.out.println(ArithmeticActions.selectAction(15, 5, 3));
        System.out.println(ArithmeticActions.selectAction(1, 10, 100));
    }
}
