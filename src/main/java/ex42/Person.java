package ex42;

public class Person {
    private String firstName;
    private String lastName;
    private String salary;

    public Person(String firstName,String lastName, String salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }

    public static Person createPerson(String[] data) {
        String firstName = data[0];
        String lastName = data[1];
        String salary = data[2];
        return new Person(firstName,lastName,salary);
    }
}


