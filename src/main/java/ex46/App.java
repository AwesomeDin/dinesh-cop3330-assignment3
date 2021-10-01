package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class App {
    //Creates a hashamp to send to other functions that uses the word as the key,
    //will send in the path of where the file is and will call the printing and filtering
    //functions to make sure the one with the highest count is at the top.
    public static void main(String[] args) throws FileNotFoundException {
        Map<String,Integer> wordCount = new HashMap<>();
        WordFrequency.countFrequency("src/main/java/ex46/exercise46_input.txt",wordCount);
        printerTime(wordCount,filterTime(wordCount));
    }

    //Filter the hashmap given to us to make sure its ordered by highest count
    public static Object[] filterTime(Map<String,Integer> wordCount) {
        Object[] filter = wordCount.entrySet().toArray();
        Arrays.sort(filter, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });
        return filter;
    }

    //Print everything in a table format and make sure the count is printed in stars
    public static void printerTime(Map<String,Integer> wordCount,Object[] filter) {
        for(Object e: filter) {
            System.out.format("%-10s: ",((Map.Entry<String, Integer>) e).getKey());
            for(int i = 0;i< (((Map.Entry<String,Integer>) e).getValue()); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
