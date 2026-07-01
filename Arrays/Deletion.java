package Arrays;
import java.util.*;

public class Deletion {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the elements: ");
        int size = s.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter the " +size +" of the elements: ");
        for(int i = 0; i < size; i++) {
            System.out.print((i + 1)+": ");
            numbers[i] = s.nextInt();
        } 

        System.out.print("Enter the position of element you've want to delete (1-"+size+"): "); 
        int position = s.nextInt();
        for(int i = position - 1; i < size - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        size--;

        System.out.print("Array after deletion : ");
        for(int i = 0; i < size; i++) {
            System.out.print(numbers[i]+" ");
        }
        s.close();
    }
}
