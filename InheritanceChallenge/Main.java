package InheritanceChallenge;

public class Main {
  public static void main(String[] args) {
    SalariedEmployee employee = new SalariedEmployee("Avery", "07/11/2000", 
                                          "05/05/2025", 100000.00);
    
    System.out.println(employee);
    System.out.println("Age = " + employee.getAge());
    System.out.println("Pay = $" + employee.collectPay());

    employee.retire();
    System.out.println("Pension check = $" + employee.collectPay());
  }
}
