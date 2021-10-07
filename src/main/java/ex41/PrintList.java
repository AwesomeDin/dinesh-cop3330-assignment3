package ex41;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PrintList {
    //Uses filewriter to setup the file we will write to and then sets up the rest
    //of the table we need to print
    public void printEntry(ArrayList<String> nameList) throws IOException {
        FileWriter myWriter = new FileWriter("src/main/java/ex41/exercise41_output.txt");
        myWriter.write("Total of " + nameList.size() + " names");
        myWriter.write(System.getProperty( "line.separator" ));
        myWriter.write("------------------");
        myWriter.write(System.getProperty( "line.separator" ));
        printOut(nameList,myWriter);
        myWriter.close();
    }

    //Uses a for loop to write to the file everything in the arraylist
    public static void printOut(ArrayList<String>nameList, FileWriter myWriter) throws IOException {
        for(int i = 0;i< nameList.size();i++) {
            myWriter.write(nameList.get(i));
            myWriter.write(System.getProperty( "line.separator" ));
        }
    }

    //Pseudocode Plan

    //printEntry,Use FileWriter to write to the file
    //Set up the actual printing part of the table

    //printOut, gets the info from the arraylist
    //writes to the file

}
