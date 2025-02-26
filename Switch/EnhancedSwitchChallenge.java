package Switch;

public class EnhancedSwitchChallenge {
  public static void main(String[] args) {
    
    printDayOfWeek(0);
    printDayOfWeek(1);
    printDayOfWeek(6);
    printDayOfWeek(7);
  }

  public static void printDayOfWeek(int day) {

    String dayOfWeek = switch (day) {
      case 0 -> "Sunday";
      case 1 -> "Monday";
      case 2 -> "Tuesday";
      case 3 -> "Wednesday";
      case 4 -> "Thursday";
      case 5 -> "Friday";
      case 6 -> "Saturday";
      default -> "Invalid Day";
    };

    System.out.println("The " + day + " day of the week is " + dayOfWeek);
  }

}
