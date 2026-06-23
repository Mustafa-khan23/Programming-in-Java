import java.util.*;

public class TypeCasting {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 1 number : ");
        int num1 = s.nextInt();
        System.out.print("Enter the 2 number : ");
        int num2 = s.nextInt();
        System.out.print("Enter the 3 number : ");
        int num3 = s.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number "+num1+" is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number "+num2 +" is greater" );
        } else {
            System.out.println("Number "+num3+" is greater");
        }

        s.close();
    }
}
