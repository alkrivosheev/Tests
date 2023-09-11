package ru.job4j.loop;

public class testest {
    private int[] values;

    public int[] sort(int[] values) {
        this.values = values;
        return values;
    }

    public void echo() {
        System.out.println(this.values[0]);
    }

    public static void main(String[] args) {
        testest ar = new testest();
        final int[] immutable = {1};
        final int[] ri = ar.sort(immutable);
        ri[0] = -1;
        ar.echo();
    }
}
