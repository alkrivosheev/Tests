package ru.job4j.loop;

public class Task148 {
    public static void loop(int children, int adults, int[] cNum, int[] aNum) {
        int summChild = 0;
        int summAdult = 0;
        int groups = 0;
        int lostCh = 0;
        int lostAdult = 0;
        for (int i = 0; i < aNum.length; i++) {
            if (summChild + cNum[i] <= children && summAdult + aNum[i] <= adults) {
                summChild += cNum[i];
                summAdult += aNum[i];
                groups ++;
            } else {
                break;
            }
        }
        lostCh = children - summChild;
        lostAdult = adults - summAdult;
        System.out.println("Группы: " + groups + ", Взрослых: " + summAdult + ", детей: " + summChild + ", осталось билетов взр: "
                + lostAdult + ", осталось билетов дет: " + lostCh);
    }

    public static void main(String[] args) {
        int[] ch = {5, 2, 1, 4};
        int[] adult = {5, 5, 3, 2};
        loop(10, 10 ,ch, adult);
    }
}
