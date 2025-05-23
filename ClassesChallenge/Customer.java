package ClassesChallenge;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    // Default constructor
    public Customer() {
        name = "John";
        creditLimit = 5000;
        email = "johndoe@gmail.com";
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // Constructor chaining
    public Customer(String name, String email) {
        this(name, 1000, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void printCustomer() {
        System.out.println("Name: " + name + "\n" +
                            "Credit limit: " + creditLimit + "\n" +
                            "Email: " + email);
    }
}
