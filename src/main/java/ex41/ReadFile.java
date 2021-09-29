package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFile {
    public ArrayList<String> readEntry(ArrayList<String> nameList) {
        try {
            File myObj = new File("src/main/java/ex41/exercise41_input.txt");
            Scanner myInput = new Scanner(myObj);
            while(myInput.hasNextLine()) {
                    String data = myInput.nextLine();
                    nameList = addPeople(nameList,data);
            }
            myInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred with the file.");
            e.printStackTrace();
            System.exit(1);
        }
        return nameList;
    }

    public static ArrayList<String> addPeople(ArrayList<String> nameList,String data){
        nameList.add(data);
        return nameList;
    }
}
