
import java.util.Scanner;

class Demo {
    int value;
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public void display() {
        System.out.println("Value: " + this.value);
    }
}

class Exp49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int value = sc.nextInt();
        
        Demo d = new Demo();
        d.setValue(value);
        d.display();
        
        sc.close();
    }
}
