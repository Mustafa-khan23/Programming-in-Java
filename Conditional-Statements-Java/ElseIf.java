import java.util.*;

public class ElseIf {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        int percentage = s.nextInt();

        if (percentage >= 90 && percentage <= 100) {
            System.out.println("Grade A");
        } else if(percentage >= 70 && percentage <= 89) {
            System.out.println("Grade B");
        } else if(percentage >= 50 && percentage <= 69) {
            System.out.println("Grade C");
        } else {
             System.out.print("Fail-F");
        }

        s.close();
    }    
}
