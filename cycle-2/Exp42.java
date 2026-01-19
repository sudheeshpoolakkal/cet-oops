
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    public void display() {
        System.out.println("Name: " + name + " Roll: " + rollNo);
    }
}

class Exp42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name1 = sc.nextLine();
        int roll1 = sc.nextInt();
        sc.nextLine();
        String name2 = sc.nextLine();
        int roll2 = sc.nextInt();
        
        Student s1 = new Student(name1, roll1);
        Student s2 = new Student(name2, roll2);
        
        s1.display();
        s2.display();
        
        sc.close();
    }
}
