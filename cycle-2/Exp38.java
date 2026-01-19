
import java.util.Scanner;

class Exp38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i));
                compressed.append(count);
                count = 1;
            }
        }
        
        String result = compressed.toString();
        if (result.length() < s.length()) {
            System.out.println(result);
        } else {
            System.out.println(s);
        }
        sc.close();
    }
}
