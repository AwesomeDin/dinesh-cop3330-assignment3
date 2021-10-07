package ex42;

public class Person {
    private String firstName;
    private String lastName;
    private String salary;

    //Construct for the person class to create a person object
    public Person(String firstName,String lastName, String salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //Getter for firstname
    public String getFirstName() {
        return firstName;
    }
    //Setter for firstname
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Getter for lastname
    public String getLastName() {
        return lastName;
    }
    //Setter for lastname
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getter for salary
    public String getSalary() {
        return salary;
    }
    //Setter for salary
    public void setSalary(String salary) {
        this.salary = salary;
    }

    //Method that is used to create a person using data passed in
    public static Person createPerson(String[] data) {
        String firstName = data[0];
        String lastName = data[1];
        String salary = data[2];
        return new Person(firstName,lastName,salary);
    }

    //Pseudocode Plan

    //Constructor that allows you to set first,last,salary

    //Set up setters and getters for
    //every single data point (first,last,salary)

    //createPerson, gets data from the reader class
    //creates a new person using data
}


