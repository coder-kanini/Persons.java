public class Person {
    String name;
    int age;
    String address;

    // Constructor with 3 parameters
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to display person's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // Method that accepts a Person object and calls displayDetails
    public void myDetails(Person person) {
        person.displayDetails();
    }

    // Method to print the current instance
    public void printCurrentInstance() {
        myDetails(this);
    }

    public static void main(String[] args) {
        // Creating an object named Faith
        Person Faith = new Person("Faith", 25, "123 Main St");

        // Calling the printCurrentInstance method using the Faith object
        Faith.printCurrentInstance();
    }
}
