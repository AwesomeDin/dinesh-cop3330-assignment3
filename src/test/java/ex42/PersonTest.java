package ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person = new Person("Rithvik","Dinesh","10");
    @Test
    void getFirstName() {
        assertEquals("Rithvik",person.getFirstName());
    }


    @Test
    void getLastName() {
        assertEquals("Dinesh",person.getLastName());
    }

    @Test
    void getSalary() {
        assertEquals("10",person.getSalary());
    }

    @Test
    void createPerson() {
        String[] data = {"Rithvik","Dinesh","10"};
        assertEquals(person.getFirstName(),Person.createPerson(data).getFirstName());
        assertEquals(person.getLastName(),Person.createPerson(data).getLastName());
        assertEquals(person.getSalary(),Person.createPerson(data).getSalary());
    }
}