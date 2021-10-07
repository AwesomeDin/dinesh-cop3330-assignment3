package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    //Main method that will call the readfunction to read from the CSV and send in the path,
    //then it will call the printer function and pass in the List
    public static void main(String[] args) throws IOException {
        List<Person> peopleList = new ArrayList<>();
        readfromCSV reader = new readfromCSV();
        peopleList = reader.readIn("src/main/java/ex42/exercise42_input.txt", peopleList);
        printerTime(peopleList);
    }

    //Prints each part of the person class in table format
    public static void printerTime(List<Person> peopleList) {
        System.out.println("Last      First     Salary");
        System.out.println("---------------------------");
        for (Person p: peopleList) {
            System.out.format("%-10s",p.getFirstName());
            System.out.format("%-10s",p.getLastName());
            System.out.format("%-10s",p.getSalary());
            System.out.println();
        }
    }

    //Pseudocode Plan

    //Main, create a list of People
    //Use a class to read from the file
    //Use a method to print everything

    //printerTime, print the table for every person


}
