package ex45;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

class AppTest {
    //I talked with TA George and he said to compare the two files in order to check them,
    //I added the Apache dependency in order to compare the two files using fileutils.
    @Test
    void generalTest() throws IOException {
        File file1 = new File("src/main/java/ex45/exercise45_output.txt");
        File file2 = new File("src/main/java/ex45/exercise45_input.txt");
        assertFalse(FileUtils.contentEquals(file1,file2));
    }

}