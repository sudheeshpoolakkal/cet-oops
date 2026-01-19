
import java.util.Scanner;

class Exp37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        
        if (n == 0) {
            System.out.println("-1");
            sc.close();
            return;
        }
        
        String prefix = strings[0];
        
        for (int i = 1; i < n; i++) {
            while (strings[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("-1");
                    sc.close();
                    return;
                }
            }
        }
        
        System.out.println(prefix);
        sc.close();
    }
}
