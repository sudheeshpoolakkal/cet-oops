
import java.util.Scanner;
import java.util.Arrays;

class Exp35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        if (s1.length() != s2.length()) {
            System.out.println("false");
        } else {
            char[] arr1 = s1.toLowerCase().toCharArray();
            char[] arr2 = s2.toLowerCase().toCharArray();
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
        sc.close();
    }
}

