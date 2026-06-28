package Input;
import java.util.*;
public class InputSentence {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in); //Instance of a class
        String sentence = s.nextLine();

        System.out.println(sentence);
        s.close();
    }
}
