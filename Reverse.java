import java.util.Scanner;

public class Reverse{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		int n = num;
		int rev = 0;
		while(n!=0){
		rev = (rev *10)+(n%10);
		n/=10;
	}
System.out.println("The reverse is : " + rev);
}
}
		

