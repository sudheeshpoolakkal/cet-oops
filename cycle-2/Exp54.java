
import java.util.Scanner;

class Exp54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally block executed");
        }
        
        sc.close();
    }
}
