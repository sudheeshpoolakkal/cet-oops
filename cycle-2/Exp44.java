
import java.util.Scanner;

class Complex {
    int real;
    int imaginary;
    
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
    
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

class Exp44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex sum = c1.add(c2);
        
        sum.display();
        
        sc.close();
    }
}
