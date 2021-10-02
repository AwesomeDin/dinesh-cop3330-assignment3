package ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterNames() {
        //Two lists one in order and one not in order
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> testList = new ArrayList<>();
        nameList.add("Johnson, Jim");
        nameList.add("Jones, Aaron");
        nameList.add("Jones, Chris");
        nameList.add("Ling, Mai");
        nameList.add("Swift, Geoffrey");
        nameList.add("Xiong, Fong");
        nameList.add("Zarnecki, Sabrina");


        testList.add("Zarnecki, Sabrina");
        testList.add("Johnson, Jim");
        testList.add("Jones, Aaron");
        testList.add("Jones, Chris");
        testList.add("Ling, Mai");
        testList.add("Swift, Geoffrey");
        testList.add("Xiong, Fong");
        assertEquals(nameList,App.filterNames(testList));
    }
}