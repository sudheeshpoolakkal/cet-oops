import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num = scanner.nextInt();
	 int fact = 1;	
	factorial(num);
} 
	int factorial(int num){
	while(num!=0){
	fact = fact * num;
	num--; return fact;
	}
}
