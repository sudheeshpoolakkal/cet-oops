
import java.util.Scanner;

interface Resume {
    void biodata();
}

class Teacher implements Resume {
    String name;
    String qualification;
    int experience;
    
    public Teacher(String name, String qualification, int experience) {
        this.name = name;
        this.qualification = qualification;
        this.experience = experience;
    }
    
    @Override
    public void biodata() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
    }
}

class Exp47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        String qualification = sc.nextLine();
        int experience = sc.nextInt();
        
        Teacher teacher = new Teacher(name, qualification, experience);
        teacher.biodata();
        
        sc.close();
    }
}
