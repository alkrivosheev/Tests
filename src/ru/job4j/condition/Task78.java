package ru.job4j.condition;

public class Task78 {
    public static void divWithoutRemainder(int num) {
        StringBuffer sb = new StringBuffer();
        int n3 = num % 10;
        int n2 = (num / 10) % 10;
        int n1 = (num / 100) % 10;
        if (n1 != 0 && num % n1 == 0) {
            sb.append(n1);
        }
        if (n2 != 0 && num % n2 == 0) {
            if (!sb.isEmpty()) sb.append(" ");
            sb.append(n2);
        }
        if (n3 != 0 && num % n3 == 0) {
            if (!sb.isEmpty()) sb.append(" ");
            sb.append(n3);
        }
        if (sb.isEmpty()) {
            System.out.println("Таких чисел нет");
        } else System.out.println(sb);
    }

    public static void main(String[] args) {
        divWithoutRemainder(100);
    }
}
