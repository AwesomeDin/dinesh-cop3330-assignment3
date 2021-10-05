package ex45;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {

    @Test
    void checkIn() throws IOException {
        String find = "utilize";
        String replace = "use";
        String fileName = "src/main/java/ex45/exercise45_input.txt";
        String tofileName = "src/main/java/ex45/exercise45_output.txt";
        Path path = Paths.get(fileName);
        Path toPath = Paths.get(tofileName);
        BufferedWriter writer = Files.newBufferedWriter(toPath, Charset.defaultCharset());
        Scanner myInput = new Scanner(path,Charset.defaultCharset());
        assertEquals(1,WordFinder.checkIn(myInput,find,replace,writer));
    }
}