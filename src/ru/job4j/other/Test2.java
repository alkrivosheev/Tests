package ru.job4j.other;

public class Test2  {

    private String name;

    private String hello;

    public Test2(String name) { this.name = name; }

    public String getHello() { return hello; }

    public static void main(String[] args) {
        String name = "Dog";
        change(name);
        System.out.print(name);
        name = change(name);
        System.out.print(name);
    }
    public static String change(String name) {
        name = name + "Cat";
        String surname = "Kotov";
        return surname;
    }
}
