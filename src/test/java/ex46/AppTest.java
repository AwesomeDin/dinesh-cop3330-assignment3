package ex46;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterTime() {
        Map<String,Integer> wordCount = new HashMap<>();
        Map<String,Integer> testCount = new HashMap<>();
        testCount.put("badger",7);
        testCount.put("mushroom", 2);
        testCount.put("snake",1);

        wordCount.put("snake",1);
        wordCount.put("mushroom", 2);
        wordCount.put("badger",7);

        Object[] testfilter = testCount.entrySet().toArray();
        assertEquals(testfilter[2],App.filterTime(wordCount)[0]);
    }
}