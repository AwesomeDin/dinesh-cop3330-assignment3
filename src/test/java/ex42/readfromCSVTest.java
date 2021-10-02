package ex42;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class readfromCSVTest {
    List<Person> peopleList = new ArrayList<>();
    List<Person> testList = new ArrayList<>();


    @Test
    void readIn() throws IOException {
        readfromCSV reader = new readfromCSV();
        peopleList.add(new Person("Ling","Mai","55900"));
        assertEquals(peopleList.get(0).getFirstName(),reader.readIn("src/main/java/ex42/exercise42_input.txt",testList).get(0).getFirstName());
    }

    @Test
    void scanIn() throws IOException {
        peopleList.add(new Person("Ling","Mai","55900"));
        Path pathToFile = Paths.get("src/main/java/ex42/exercise42_input.txt");
        BufferedReader br = Files.newBufferedReader(pathToFile);
        String line = br.readLine();
        assertEquals(peopleList.get(0).getFirstName(),readfromCSV.scanIn(testList,line,br).get(0).getFirstName());
    }
}