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
    public static void main(String[] args) {
        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/ex44/exercise44_input.json"));
            Result result = gson.fromJson(br,Result.class);
            Product p = findName(result);
            System.out.format("Name: %s\nPrice: %.2f\nQuantity: %d",p.getName(),p.getPrice(),p.getQuantity());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Product findName(Result result) {
        while(true){
            String name = scanIn("What is the product name? ");
            for(Product p: result.getProducts()) {
                if (p.getName().equals(name)) {
                    return p;
                }
            }
                System.out.println("Sorry, that product was not found in our inventory.");
        }
    }

    public static String scanIn(String s) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        return myInput.nextLine();
    }
}
