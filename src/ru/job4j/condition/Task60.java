package ru.job4j.condition;

public class Task60 {
    public static void numRelation(int a, int b, int c) {
        StringBuffer sb = new StringBuffer();
        if (a == b && a == c && b ==c) {
            sb.append("Все равны");
        } else if (a == b || a == c || b == c) {
            if (a == b) {
                sb.append("Первое и второе равны, ");
                if (a < c) {
                    sb.append("третье больше");
                } else {
                    sb.append("третье меньше");
                }
            }
            if (a == c) {
                sb.append("Первое и третье равны, ");
                if (a < b) {
                    sb.append("второе больше");
                } else {
                    sb.append("второе меньше");
                }
            }
            if (b == c) {
                sb.append("Второе и третье равны, ");
                if (b < a) {
                    sb.append("первое больше");
                } else {
                    sb.append("первое меньше");
                }
            }
        } else {
            sb.append("Равных нет");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        numRelation(2, 3, 2);
    }
}
