package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void countFrequency(String fileName, Map<String,Integer> wordCount) throws FileNotFoundException {
        Scanner myInput = new Scanner(new File(fileName));
        while(myInput.hasNext()) {
            String word = myInput.next();
            Integer count = wordCount.get(word);
            if(count!= null)
                count++;
            else
                count = 1;
            wordCount.put(word,count);
        }
        myInput.close();
    }
}
