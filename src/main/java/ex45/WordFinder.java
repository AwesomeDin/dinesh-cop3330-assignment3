package ex45;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordFinder {
    //Replaces the text by finding the word and changing it. Uses Path to modify and write a new file.
    public static void replaceText(String fileName, String find, String replace,
                            String tofileName) throws IOException {
        Path path = Paths.get(fileName);
        Path toPath = Paths.get(tofileName);
        BufferedWriter writer = Files.newBufferedWriter(toPath, Charset.defaultCharset());
        Scanner myInput = new Scanner(path,Charset.defaultCharset());
        int x = checkIn(myInput,find,replace,writer);
        myInput.close();
        writer.close();
    }

    //Goes through every word in the textfile to check if there is the target word to replace, once it replaces
    //it will write that line to the new file. returns 1 to show its successful.
    public static int checkIn(Scanner myInput, String find, String replace, BufferedWriter writer) throws IOException {
        while (myInput.hasNextLine()) {
            String line = myInput.nextLine();
            line = line.replaceAll(find,replace);
            writer.write(line);
            writer.newLine();
        }
        return 1;
    }

    //Pseudocode Plan

    //replaceText, get the path from and to for the files
    //Use bufferedwriter to the write to the new file

    //checkIn, if the old file still had a line
    //check if that line has the word to replace and then
    //write to the new file
    //use the replaceall method

}
