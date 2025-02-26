package Section6CodingExercises;

public class NumberOfDaysInMonth {
  public static void main(String[] args) {
    
    System.out.println(getDaysInMonth(1, 2020));
    System.out.println(getDaysInMonth(2, 2020));
    System.out.println(getDaysInMonth(2, 2018));
    System.out.println(getDaysInMonth(-1, 2020));
    System.out.println(getDaysInMonth(1, -2020));
    System.out.println(getDaysInMonth(8, 2020));

  }

  public static boolean isLeapYear(int year) {
    boolean leapYear = false;
    if (year >=1 && year <= 9999) {
      if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0))
        leapYear = true;
    }

    return leapYear;
  }

  public static int getDaysInMonth(int month, int year) {

    if (year < 1 || year > 9999) {
      return -1;
    }

    return switch (month) {
      case 1, 3, 5, 7, 8, 10, 12 -> 31;
      case 4, 6, 9, 11 -> 30;
      case 2 -> {
        if (isLeapYear(year)) {
          yield 29;
        } else {
          yield 28;
        }
      }
      default -> -1;
    };
    
  }

}
