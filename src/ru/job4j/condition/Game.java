package ru.job4j.condition;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        double sum = percent * prize;
        if (sum > pay) {
            return (int) sum - pay;
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(Game.checkGame(0.2, 50, 9));
        System.out.println(Game.checkGame(0.9, 1, 2));
    }
}
