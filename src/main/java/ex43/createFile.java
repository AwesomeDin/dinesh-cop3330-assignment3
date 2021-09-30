package ex43;

import java.io.*;

public class createFile {
    public void newFile(String name, String author) {
        String html = "<html><head><meta name = \"author\" content = \""+author+"\"><title>" + author+ "</title></head></html>";
        File f = new File("src/main/java/ex43/index.html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write(html);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
