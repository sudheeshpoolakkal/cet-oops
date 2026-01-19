import java.util.Scanner;
class Exp34{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
String s = scanner.nextLine();
String[] word = s.split("\\s+");
for(int i = word.length -1; i>=0; i--){
System.out.println(word[i]);
if(i>0)
System.out.print(" ");
}
scanner.close();
}
}
