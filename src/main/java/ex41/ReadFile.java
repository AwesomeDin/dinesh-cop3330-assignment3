package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFile {

    //Will get the file and begin reading all the names in and add them to an arraylist.
    public ArrayList<String> readEntry(ArrayList<String> nameList) throws FileNotFoundException {
        File myObj = new File("src/main/java/ex41/exercise41_input.txt");
        Scanner myInput = new Scanner(myObj);
        while(myInput.hasNextLine()) {
            String data = myInput.nextLine();
            nameList = addPeople(nameList,data);
        }
        myInput.close();
        return nameList;
    }

    //Function that adds the people to the arraylist
    public static ArrayList<String> addPeople(ArrayList<String> nameList,String data){
        nameList.add(data);
        return nameList;
    }
}
