package ex43;

import java.io.*;

public class createFile {
    //Creates the file with the name and author passed in, uses bufferedwriter to write this to
    //a new file
    public void newFile(String name, String author) throws IOException {
        String html = "<html><head><meta name = \"author\" content = \""+author+"\"><title>" + author+ "</title></head></html>";
        File f = new File("src/main/java/ex43/index.html");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        bw.write(html);
        bw.close();
    }
}
