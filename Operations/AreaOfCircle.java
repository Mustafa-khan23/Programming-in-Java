package Operations;
import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]) {
        double PI = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        float areaCircle = s.nextFloat();
        double calculate = PI * areaCircle * areaCircle;
        System.out.print("Therefore the area of the circle is : " + calculate);

        s.close();
    }
}
