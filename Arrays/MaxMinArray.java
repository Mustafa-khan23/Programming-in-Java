package Arrays;
import java.util.*;

public class MaxMinArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter the array values : ");

        for(int i = 0; i < numbers.length; i++) {
            System.out.print("Elements "+(i + 1)+": ");
            numbers[i] = s.nextInt();
        }

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Index "+i+": "+numbers[i]);
        }

        int max = numbers[0];
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum size of element in the array is: "+max);
        System.out.println("Minimum size of element in the array is: "+min);


        s.close();
    }
}
