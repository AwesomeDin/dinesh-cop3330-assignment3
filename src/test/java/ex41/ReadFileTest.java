package ex41;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReadFileTest {

    @Test
    void readEntry() throws FileNotFoundException {
        ReadFile readfile = new ReadFile();
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> testList = new ArrayList<>();
        nameList.add("Ling, Mai");
        nameList.add("Johnson, Jim");
        nameList.add("Zarnecki, Sabrina");
        nameList.add("Jones, Chris");
        nameList.add("Jones, Aaron");
        nameList.add("Swift, Geoffrey");
        nameList.add("Xiong, Fong");

        assertEquals(nameList,readfile.readEntry(testList));
    }

    @Test
    void addPeople() {
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> testList = new ArrayList<>();
        nameList.add("Ling, Mai");
        assertEquals(nameList,ReadFile.addPeople(testList,"Ling, Mai"));
    }
}