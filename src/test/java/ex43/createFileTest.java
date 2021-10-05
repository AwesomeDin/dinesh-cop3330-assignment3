package ex43;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class createFileTest {

    @Test
    void newFile() throws IOException {
        File file = new File("src/main/java/ex43/index.html");
        assertTrue(file.exists());
    }
}