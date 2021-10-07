package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    //Checks the count of each word and attaches it to the hashmap by going through
    //each word in the text file
    public static void countFrequency(String fileName, Map<String,Integer> wordCount) throws FileNotFoundException {
        Scanner myInput = new Scanner(new File(fileName));
        while(myInput.hasNext()) {
            String word = myInput.next();
            Integer count = wordCount.get(word);
            count = counterCheck(count);
            wordCount.put(word,count);
        }
        myInput.close();
    }

    //Checks to see if the count is null but otherwise it will just increase by 1
    //each it sees the word
    public static Integer counterCheck (Integer count) {
        if(count!= null)
            return count+1;
        return 1;
    }

    //Pseudocode Plan

    //countFrequency, use .hasNext()
    //while there is still a line we add the count

    //counterCheck, intializes count

}
