public class LoopsInJava {
    public static void main(String args[]) {
        //for loop :
        System.out.println("This is by for loop");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //while loop :
        System.out.println("This is by while loop");
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //do-while loop : 
        System.out.println("This is by do-while loop");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while(j <= 10);
    }
}