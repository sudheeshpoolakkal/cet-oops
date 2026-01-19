
import java.util.Scanner;

class AreaCalculator {
    public float calculateArea(float radius) {
        return (float) (Math.PI * radius * radius);
    }
    
    public float calculateArea(float length, float breadth) {
        return length * breadth;
    }
    
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
}

class Exp41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float radius = sc.nextFloat();
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        AreaCalculator calc = new AreaCalculator();
        
        System.out.printf("%.2f%n", calc.calculateArea(radius));
        System.out.printf("%.2f%n", calc.calculateArea(length, breadth));
        System.out.printf("%.2f%n", calc.calculateArea(base, height));
        
        sc.close();
    }
}
