package ex43;

import java.io.File;

public class createFolder {
    //Creates a file in the exercise directory plus the name css or js, whichever
    //the user passed in
    public void newFolder(String addOn) {
        String directory = "src/main/java/ex43" + addOn;
        File f1 = new File(directory);
        f1.mkdir();
    }
}
