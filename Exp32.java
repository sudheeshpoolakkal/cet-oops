import java.util.Scanner;
class Exp32{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
String s = scanner.nextLine();
String reversed = new StringBuilder(s).reverse().toString();
if(s.equalsIgnoreCase(reversed))
System.out.println("1");
else
System.out.println("0");

scanner.close();
}
}
