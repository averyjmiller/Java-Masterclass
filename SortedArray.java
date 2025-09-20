import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {

  public static void main(String[] args) {
    int[] arr = SortedArray.getIntegers(5);

    System.out.println(Arrays.toString(arr));
    SortedArray.printArray(arr);
    int[] sortedArr = SortedArray.sortIntegers(arr);
    System.out.println(Arrays.toString(sortedArr));
    SortedArray.printArray(sortedArr);
  }
    
  public static int[] getIntegers(int len) {
    Scanner s = new Scanner(System.in);


    int[] arr = new int[len];

    System.out.print("Enter integers: ");

    for(int i = 0; i < len; i++) {
      arr[i] = s.nextInt();
    }

    s.close();

    return arr;
  }

  public static void printArray(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      System.out.printf("Element %d contents %d%n", i, arr[i]);
    }
  }

  public static int[] sortIntegers(int[] arr) {
    int[] sortedArr = Arrays.copyOf(arr, arr.length);
    int temp;
    boolean flag = true;
    while(flag) {
      flag = false;
      for(int i = 0; i < arr.length - 1; i++) {
        if(sortedArr[i] < sortedArr[i + 1]) {
          temp = sortedArr[i];
          sortedArr[i] = sortedArr[i + 1];
          sortedArr[i + 1] = temp;
          flag = true;
        }
      }
    }
    return sortedArr;
  }
}
