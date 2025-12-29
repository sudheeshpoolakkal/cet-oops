import java.util.Scanner;

public class HCF{
	public static void main(String[] args){
	
	int a,b;
	Scanner scanner = new Scanner(System.in);
	
	 System.out.println("Enter the value for A:");
                int A = scanner.nextInt();
         System.out.println("Enter the value for B:");
         	int B = scanner.nextInt();


int divident, divisor, remainder;
if(A>B){ divident=A;divisor=B;} else{ divident=B; divisor=A; }
remainder = 100;
	while(remainder!=0){
	remainder = divident % divisor;
	if(remainder ==	0){ System.out.println("HCF is :" + divisor); break; }
	divident = divisor;
	divisor = remainder;
	}	
}
}
