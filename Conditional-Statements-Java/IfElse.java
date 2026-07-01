import java.util.*;

public class IfElse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: "); 
        int age = s.nextInt();

        if (age >= 18) {
            System.out.println("You're Eligible to vote");
        } else {
            System.out.print("Not Eligible to vote!");
        }

        s.close();
    }
}
