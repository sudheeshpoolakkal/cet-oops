import java.util.Scanner;

public class Stars{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of stars: ");
		int num = scanner.nextInt();
		
		int i;
		
		for(i = 0; i < num; i++)
		System.out.print("*");
		
		System.out.println("\n");		
		for(i = 0; i < num; i++)
		System.out.println("*");
		}
}
