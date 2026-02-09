
import java.util.Scanner;
import java.io.IOException;

class Exp55 {
    public static void check(int n) throws IOException {
        if (n < 0) {
            throw new IOException();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        try {
            check(n);
            System.out.println(n);
        } catch (IOException e) {
            System.out.println("Caught: IO Exception");
        }
        
        sc.close();
    }
}
