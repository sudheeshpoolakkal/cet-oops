import java.util.Scanner;

class Exp10{
        public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double angle;
        System.out.println("Enter the angle in degree :");
        angle = scanner.nextDouble();
        double radians = angle * (Math.PI/180);
        System.out.println("Sine: " + sine(radians) + "\t" + "Cosine: " + cosine(radians));
        }

static double sine(double radians){

return Math.sin(radians);
}

static double cosine(double radians){

return Math.cos(radians);
}
}

