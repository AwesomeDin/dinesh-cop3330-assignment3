package ex43;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class createFolderTest {
    @Test
    void newFolder() {
        File folder = new File("src/main/java/ex43/css");
        assertTrue(folder.exists());
        File folder2 = new File("src/main/java/ex43/js");
        assertTrue(folder2.exists());
    }

}