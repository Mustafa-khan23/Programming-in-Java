package Arrays;
import java.util.*;

public class Inserting {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] numbers = new int[size + 1];


        System.out.print("Enter " +size+ " elements of the array : ");
        for(int i = 0; i < size; i++) {
            numbers[i] = s.nextInt();
        }

        System.out.print("Enter the element to insert : ");
        int insert = s.nextInt();
        numbers[size] = insert;
        size++;

        System.out.println("Array after inserting new element");
        for(int i = 0; i < size; i++) {
            System.out.print(numbers[i]+" ");
        }
        
        s.close();
    }
}
