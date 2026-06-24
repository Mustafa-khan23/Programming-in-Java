package CoreJava;
import java.util.*;

public class InputJava {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //different types of inputs 
        String StrInpt = sc.next(); //use for only one word or single word string
        String StrIpt = sc.nextLine(); //use for whole sentence to input
        int Number = sc.nextInt(); //use for taking number value as input / .nextLong for biggervalue
        float PI = sc.nextFloat(); //use for taking decimal value as input / .nextDouble for biggerValue
        short ShInput = sc.nextShort(); //use for taking short type of input
        byte ByteInput = sc.nextByte(); //use for taking byte type of input
        sc.close();
    }
}
