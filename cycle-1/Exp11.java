import java.util.Scanner;

public class Exp11 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
//reading the size of array
int n = sc.nextInt();
//read array elements
int[] nums = new int[n];
for(int i = 0; i<n; i++) 
	nums[i] = sc.nextInt();

//find largest element and its index
int maxVal = nums[0];
int maxIdx = 0;

for(int i = 1; i < n; i++){
	if(nums[i] > maxVal) {
	maxVal = nums[i];
	maxIdx = i;
}
}

//check largest element is at least twice every other element

boolean isDominant = true;
for(int i = 0; i < n; i++) {
if (i!=maxIdx && maxVal < 2 * nums[i]){
	isDominant = false;

break;
}
}
if(isDominant){
System.out.println(maxIdx);
} else {
	System.out.println(-1);
}
sc.close();
}
}
