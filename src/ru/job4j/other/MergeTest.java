package ru.job4j.other;
/*
Разбираемся с применением функции merge()
*/
import java.util.HashMap;
public class MergeTest {
    public static void main(String[] args) {
        /*// merge добавляет новую связь в prices
        HashMap<String, Integer> prices = new HashMap<>();

        // insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("HashMap: " + prices);

        int returnedValue = prices.merge("Shirt", 100, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Price of Shirt: " + returnedValue);

        // print updated HashMap
        System.out.println("Updated HashMap: " + prices);*/
        /*
        // create an HashMap
        HashMap<String, String> countries = new HashMap<>();

        // merge изменяет связь в prices
        countries.put("Washington", "America");
        countries.put("Canberra", "Australia");
        countries.put("Madrid", "Spain");
        System.out.println("HashMap: " + countries);

        // merge mapping for key Washington
        String returnedValue = countries.merge("Washington", "USA", (oldValue, newValue) -> oldValue + "/" + newValue);
        System.out.println("Washington: " + returnedValue);

        // print updated HashMap
        System.out.println("Updated HashMap: " + countries);*/
        // create an HashMap
        HashMap<String, Integer> prices1 = new HashMap<>();

        // insert entries to the HashMap
        /*Here, the HashMap forEach() method accesses each entry of the hashmap prices2 and merges it to the hashmap prices1. We have used two lambda expressions:

        (key, value) -> prices.merge(...) - It accesses each entry of prices1 and passes it to the merge() method.
        (oldValue, newValue) -> {...} - It is a remapping function. It compares two values and returns the smaller value.
                Since the key Shoes is present in both the hashmap, the value of Shoes is replaced by the result of the remapping function.*/
        prices1.put("Pant", 230);
        prices1.put("Shoes", 350);
        System.out.println("HashMap 1: " + prices1);

        // create another hashmap
        HashMap<String, Integer> prices2 = new HashMap<>();

        //insert entries to the HashMap
        prices2.put("Shirt", 150);
        prices2.put("Shoes", 320);
        System.out.println("HashMap 2: " + prices2);

        // forEach() access each entries of prices2
        // merge() inserts each entry from prices2 to prices1
        prices2.forEach((key, value) -> prices1.merge(key, value, (oldValue, newValue) -> {

            // return the smaller value
            if (oldValue < newValue) {
                return oldValue;
            }
            else {
                return newValue;
            }
        }));

        System.out.println("Merged HashMap: " + prices1);
    }
}
