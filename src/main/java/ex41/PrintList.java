package ex41;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PrintList {
    public void printEntry(ArrayList<String> nameList) {
        try {
            FileWriter myWriter = new FileWriter("src/main/java/ex41/exercise41_output.txt");
            myWriter.write("Total of " + nameList.size() + " names");
            myWriter.write(System.getProperty( "line.separator" ));
            myWriter.write("------------------");
            myWriter.write(System.getProperty( "line.separator" ));
            for(int i = 0;i< nameList.size();i++) {
                myWriter.write(nameList.get(i));
                myWriter.write(System.getProperty( "line.separator" ));
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
