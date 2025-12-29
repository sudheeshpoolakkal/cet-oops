import System.util.Scanner;

public class Arithmetic{
		private flaot num1;
                private flaot num2;


	public Arithmetic(float num1, float num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	public void average(float num1, float num2){
		System.out.println("The average is: " + (num1 + num2)/2);
	}

	public void sum(float num1, float num2){
		System.out.println("The sum is: " + num1+num2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number :");
		float num1 = scanner.nextFloat();
		System.out.println("Enter the second number :");
		float num2 = scanner.nextFloat();

		Arithmetic calc = new Arithmetic(num1,num2);
		
			while(true){
			System.out.println("1. Find Average\n2. Find Sum");
			int option = scanner.nextInt();
			switch(option){
				case 1: average(); break;
				case 2: sum(); break;
				case 3: exit(0);
				default : System.out.println("Invalid input");
			}
}}


