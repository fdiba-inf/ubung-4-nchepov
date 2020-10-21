package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int index = input.nextInt();
        int[] numbers = new int[index];
char space = ' ';
String spacefield = new String();
        System.out.println("Enter numbers: ");
        for (int i = 0; i< numbers.length; i++) {
            numbers[i] = input.nextInt();

        }
      for(int j = 0; j< numbers.length; j++)
      {
        spacefield+=space;
            System.out.println(spacefield + numbers[j]);              
}
}
}


