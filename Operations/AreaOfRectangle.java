package Operations;
import java.util.*;

public class AreaOfRectangle {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        float length = s.nextFloat();
        System.out.print("Enter the breath of the Rectangle : ");
        float breath = s.nextFloat();

        float area = length * breath;
        float perimeter = 2 * (length + breath);
        System.out.println("Therefore the area is "+area+" and perimeter is "+perimeter);

        s.close();        
    }
}
