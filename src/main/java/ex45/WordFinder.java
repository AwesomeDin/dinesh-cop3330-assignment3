package ex45;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordFinder {
    static void replaceText(String fileName, String find, String replace,
                            String tofileName) throws IOException {
        Path path = Paths.get(fileName);
        Path toPath = Paths.get(tofileName);
        BufferedWriter writer = Files.newBufferedWriter(toPath, Charset.defaultCharset());
        Scanner myInput = new Scanner(path,Charset.defaultCharset());

        while (myInput.hasNextLine()) {
            String line = myInput.nextLine();
            line = line.replaceAll(find,replace);
            writer.write(line);
            writer.newLine();
        }
        myInput.close();
        writer.close();
    }
}
