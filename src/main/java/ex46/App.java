package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String,Integer> wordCount = new HashMap<>();
        WordFrequency.countFrequency("src/main/java/ex46/exercise46_input.txt",wordCount);
        printerTime(wordCount);
    }

    public static void printerTime(Map<String,Integer> wordCount) {
        Object[] filter = wordCount.entrySet().toArray();
        Arrays.sort(filter, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });
        for(Object e: filter) {
            System.out.format("%-10s: ",((Map.Entry<String, Integer>) e).getKey());
            for(int i = 0;i< (((Map.Entry<String,Integer>) e).getValue()); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
