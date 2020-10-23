package exercise4;
import java.util.Arrays;
import java.util.Scanner;
public class MinIndex {
  public static void main(String[] args) {
    int index = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int arraysize = input.nextInt();
    double[] numbers = new double[arraysize];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = input.nextInt();
    }
      double min = numbers[0];
    for (int j = 1; j < numbers.length; j++) {
      if(min > numbers[j]) {
        min = numbers[j];
        index = j;
      }
      }
      System.out.println("Min index: " + index);
  }
}