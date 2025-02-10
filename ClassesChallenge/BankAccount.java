package ClassesChallenge;

public class BankAccount {
  private int accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

  public int getAccountNumber() {
    System.out.println("Account Number: " + accountNumber);
    return accountNumber;
  }

  public double getBalance() {
    System.out.println("Balance: $" + balance);
    return balance;
  }

  public String getCustomerName() {
    System.out.println("Name: " + customerName);
    return customerName;
  }

  public String getEmail() {
    System.out.println("Email: " + email);
    return email;
  }

  public String getPhoneNumber() {
    System.out.println("Phone Number: " + phoneNumber);
    return phoneNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
  
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
  
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void depositFunds(int funds) {
    this.balance += funds;
    System.out.println("$" + funds + " has been added to your balance");
    System.out.println("You now have $" + balance + " in your account");
  }

  public void withdrawlFunds(int funds) {
    if((this.balance - funds) >= 0) {
      this.balance -= funds;
      System.out.println("$" + funds + " has been removed from your balance");
      System.out.println("You now have $" + balance + " in your account");  
    } else {
      System.out.println("Insufficient funds!");
    }
  }
}
