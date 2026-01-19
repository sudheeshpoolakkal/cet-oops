
import java.util.Scanner;
import java.util.StringTokenizer;

class Exp39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(line);
        int sum = 0;
        
        while (st.hasMoreTokens()) {
            sum += Integer.parseInt(st.nextToken());
        }
        
        System.out.println(sum);
        sc.close();
    }
}
