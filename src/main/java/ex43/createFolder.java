package ex43;

import java.io.File;
import java.util.Scanner;

public class createFolder {
    public void newFolder(String addOn) {
        String directory = "src/main/java/ex43" + addOn;
        File f1 = new File(directory);
        f1.mkdir();
    }
}
