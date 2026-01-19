
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Experiment36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] nums = sc.nextLine().split("\\s+");
        
        Arrays.sort(nums, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
        
        StringBuilder result = new StringBuilder();
        for (String num : nums) {
            result.append(num);
        }
        
        System.out.println(result.toString());
        sc.close();
    }
}
