package ex42;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class readfromCSV {
    //Creates the list person
    public List<Person> readIn(String filename, List<Person> thePerson) throws IOException {
        Path pathToFile = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(pathToFile);
        String line = br.readLine();
        return scanIn(thePerson,line,br);
    }

    //Goes through every line and separates them out using the ",", then it will add them
    //to the person class
    public static List<Person> scanIn(List<Person> thePerson,String line,BufferedReader br) throws IOException {
        while(line != null)
        {
            String[] items = line.split(",");
            Person person = Person.createPerson(items);
            thePerson.add(person);
            line = br.readLine();
        }
        return thePerson;
    }
}
