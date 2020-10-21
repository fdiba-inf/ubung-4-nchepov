package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int index = input.nextInt();
        int[] numbers = new int[index];
int maxnumber=0;
        System.out.println("Enter numbers: ");
        for (int i = 0; i< numbers.length; i++) {
            numbers[i] = input.nextInt();
            
        }
        for(int j = 1; j< numbers.length; j++)
        {
        if(numbers[j]>numbers[j-1])
            {
               maxnumber = numbers[j];
            }
        }
System.out.println("Max number: "+maxnumber);
                       
}
}


