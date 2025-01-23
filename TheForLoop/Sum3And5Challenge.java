public class Sum3And5Challenge {
  public static void main(String[] args) {
   
    int sum = 0;
    int counter = 0;
    for (int i = 1; counter < 5 && i <= 1000; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        sum += i;
        counter++;
        System.out.println(i + " is divisible by 3 and 5");
      }
    }
    System.out.println("The sum of the numbers is " + sum);
  }
}
