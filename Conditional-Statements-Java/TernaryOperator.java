import java.util.*;

public class TernaryOperator {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: "); 
        byte age = s.nextByte();

        System.out.println(age >= 18 ? "Adult" : "Minor");
        s.close();
    }
}
