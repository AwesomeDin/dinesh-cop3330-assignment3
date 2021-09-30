package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Rithvik Dinesh
 */

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        String newFile = scanIn("What is the name of the output file? (Please type out the file name completely" +
                ", example: exercise45_output.txt) ");
        WordFinder.replaceText("src/main/java/ex45/exercise45_input.txt","utilize",
                "use", "src/main/java/ex45/"+ newFile);
    }

    public static String scanIn(String s) {
        Scanner myInput = new Scanner(System.in);
        System.out.print(s);
        return myInput.nextLine();
    }
}
