package ex42;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> peopleList = readfromCSV("src/main/java/ex42/exercise42_input.txt");
        System.out.println("Last      First     Salary");
        System.out.println("---------------------------");
        printerTime(peopleList);
    }

    public static List<Person> readfromCSV(String filename) {
        List<Person> thePerson = new ArrayList<>();
        Path pathToFile = Paths.get(filename);
        try (BufferedReader br = Files.newBufferedReader(pathToFile)) {
            String line = br.readLine();
            while(line != null)
            {
                String[] items = line.split(",");
                Person person = Person.createPerson(items);
                thePerson.add(person);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
            System.exit(1);
        }
        return thePerson;
    }

    public static void printerTime(List<Person> peopleList) {
        for (Person p: peopleList) {
            System.out.format("%-10s",p.getFirstName());
            System.out.format("%-10s",p.getLastName());
            System.out.format("%-10s",p.getSalary());
            System.out.println();
        }
    }

}
