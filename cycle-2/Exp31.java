import java.util.Scanner;
class Exp31{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
String s = scanner.nextLine();
char c = scanner.nextLine().charAt(0);
int freq = 0;
for(int i = 0; i < s.length(); i++)
{
if(s.charAt(i) == c){
freq++;
}
}
System.out.println(freq);
scanner.close();
}
}
