package ru.job4j.binary;

public class intTest {

    public static int findNumberOfBits(int x, int y) {
        int bitCount = 0;
        int z = x ^ y;
        while (z != 0) {
            bitCount += z & 1;
            z = z >> 1;
        }
        return bitCount;
    }
    public static void main(String[] args) {
        System.out.println(findNumberOfBits(12, 16));
    }
}
