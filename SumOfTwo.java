import java.util.*;

public class SumOfTwo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of num1 : ");
        int num1 = s.nextInt();
        System.out.print("Enter the value of num2 : ");
        int num2 = s.nextInt();
        int cal = num1 + num2;
        System.out.print("Therefore the sum is : " + cal);
        s.close();
    }
}
