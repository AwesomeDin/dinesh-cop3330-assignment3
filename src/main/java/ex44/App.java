package ex44;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    //Calls functions that get the information and then pass into the result class to
    //create products into one list called result. Then it prints out the final answer
    //using the findname function.
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/ex44/exercise44_input.json"));
        Result result = gson.fromJson(br,Result.class);
        Product p = findName(result);
        System.out.format("Name: %s\nPrice: %.2f\nQuantity: %d",p.getName(),p.getPrice(),p.getQuantity());
    }

    //Goes through every product and checks if the name the user inputted is in the
    //list of products
    public static Product findName(Result result) {
        Product p;
        while(true){
            String name = scanIn("What is the product name? ");
            p = ifEquals(result,name);
            if(p != null)
                break;
            System.out.println("Sorry, that product was not found in our inventory.");
        }
        return p;
    }

    //simple scanin function that gets userinput
    public static String scanIn(String s) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        return myInput.nextLine();
    }

    //checks if the name corresponds to one of the products
    public static Product ifEquals(Result result, String name) {
        for(Product p: result.getProducts()) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    //Pseudocode Plan

    //Main,use Gson and Bufferedwriter for the file
    //use result class to put the json info into product objects

    //scanIn, simple method to scan user input

    //ifEquals, method to check if that product exists in the
    //result list
}
