package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {
    //Main function, creates the arraylist which then will then read in the information and
    //print the information to a file, will be filtered with a method in the main.
     public static void main(String[] args) throws IOException {
        ArrayList<String> nameList = new ArrayList<>();
        ReadFile reader = new ReadFile();
        nameList = reader.readEntry(nameList);
        nameList = filterNames(nameList);
        PrintList printer = new PrintList();
        printer.printEntry(nameList);
     }

     //Filtering class, will use a comparator to get it down more efficiently and return
    //the arraylist back to the main so it can be printed
     public static ArrayList<String> filterNames(ArrayList<String> nameList) {
         Collections.sort(nameList, new Comparator<String>() {
             public int compare(String o1, String o2) {
                 return o1.compareTo(o2);
             }
         });
         return nameList;
     }
}