package ru.job4j.loop;

public class Task150 {
    public static void loop(int overdraft, int account, int[] transfers) {
        int ballance = account;
        int count = 0;
        for (int i = 0; i < transfers.length; i++) {
            if (ballance + transfers[i] >= overdraft && transfers[i] != 0) {
                ballance += transfers[i];
                count ++;
            } else {
                break;
            }
        }
        System.out.println("Остаток: " + ballance + ", операций: " + count);
    }

    public static void main(String[] args) {
        int[] transfers = {-400, 200, 100, -1000};
        loop(-100, 500, transfers);
    }
}
