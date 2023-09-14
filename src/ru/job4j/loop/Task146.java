package ru.job4j.loop;

public class Task146 {
    public static void loop(int[] nums) {
        int count = 0;
        int weight = 0;
        boolean c = false;
        boolean w = false;
        for (int n : nums) {
            if (count + 1 > 4 && weight + n  > 300) {
                c = true;
                w = true;
                break;
            }
            if (count <= 4 && weight + n > 300) {
                w = true;
                break;
            }
            if (count + 1 > 4 && weight <= 300) {
                c = true;
                break;
            }

            count++;
            weight += n;
        }
        if (c && w) {
            System.out.println("Людей: " + count + ", вес: " + weight + ", отказ: Много людей и перегруз");
        }else if (c) {
            System.out.println("Людей: " + count + ", вес: " + weight + ", отказ: Много людей");
        }else if (w) {
            System.out.println("Людей: " + count + ", вес: " + weight + ", отказ: Перегруз");
        } else {
            System.out.println("Людей: " + count + ", вес: " + weight + ", отказ: Нет");
        }
    }

    public static void main(String[] args) {
        int[] nums = {60, 80, 80, 70, 65};
        loop(nums);
    }
}
