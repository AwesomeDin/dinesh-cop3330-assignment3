package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {
     public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        ReadFile reader = new ReadFile();
        nameList = reader.readEntry(nameList);
        nameList = filterNames(nameList);
        PrintList printer = new PrintList();
        printer.printEntry(nameList);
     }
     public static ArrayList<String> filterNames(ArrayList<String> nameList) {
         Collections.sort(nameList, new Comparator<String>() {
             @Override
             public int compare(String o1, String o2) {
                 return o1.compareTo(o2);
             }
         });
         return nameList;
     }
}