
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Exp53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age = sc.nextInt();
        
        try {
            if (age < 18) {
                throw new InvalidAgeException("Not eligible to vote");
            }
            System.out.println("Eligible to vote");
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        sc.close();
    }
}
