package Section5CodingExercises;

public class SpeedConverter {
  public static void main(String[] args) {

  }

  public static long toMilesPerHour(double kilometersPerHour) {
    if(kilometersPerHour < 0) {
      return -1;
    } else {
      long conversion = Math.round(kilometersPerHour / 1.609);
      return conversion;
    }
  }

  public static void printConversion(double kilometersPerHour) {
    long milesPerHour = toMilesPerHour(kilometersPerHour);
    if (milesPerHour == -1) {
      System.out.println("Invalid Value");
    } else {
      System.out.println(kilometersPerHour + " km/h = " +
      milesPerHour + " mi/h");
    }
  }

}
