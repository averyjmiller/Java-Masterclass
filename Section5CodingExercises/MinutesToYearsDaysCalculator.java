public class MinutesToYearsDaysCalculator {
  public static void main(String[] args) {
    printYearsAndDays(500);
    printYearsAndDays(10000);
    printYearsAndDays(3279875439l);
  }

  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value");
      return;
    }

    long days = minutes / 1440;
    long years = days / 365;
    long remainingDays = (days == 0) ? days : days % 365;
    System.out.println(minutes + " min = " +
                      years + " y and " +
                      remainingDays + " d");
  }

}
