package ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void folderMethod() {
        assertFalse(App.folderMethod("n","yellow"));
    }
}