package ex46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {

    @Test
    void counterCheck() {
        assertEquals(1,WordFrequency.counterCheck(null));
    }
}