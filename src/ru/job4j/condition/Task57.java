package ru.job4j.condition;

public class Task57 {
    public static void triangleType(int a, int b) {
        int c = 180 - (a + b);
        StringBuffer sb = new StringBuffer();
        if (a + b > 180) {
            System.out.println("Ошибка");
            return;
        }
        if (a < 90 && b < 90 && c < 90) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append("Остроугольный");
        }
        if (a == 90 || b == 90 || (a ==45 && b ==45) || a + b == 90) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append("Прямоугольный");
        }
        if (a > 90 || b > 90 || c > 90) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append("Тупоугольный");
        }
        if ((a == b || a == 90 || b == 90 || a == c || b == c) && !(a < 45 || b < 45)) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append("Равнобедренный");
        }
        if (a == 60 && b == 60) {
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append("Равносторонний");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        triangleType(90, 45);
    }
}
