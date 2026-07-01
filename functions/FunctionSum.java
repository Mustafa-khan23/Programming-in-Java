package functions;

public class FunctionSum {
    public static int returnSum(int a , int b) {
            return a + b;
    }
    public static void main(String args[]) {
        int resutl = returnSum(4,5);
        System.out.print("Sum: "+resutl);
    }
}