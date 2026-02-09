
class Employee45 {
    public void display() {
        System.out.println("Name of class is Employee");
    }
}

class Engineer extends Employee45 {
    @Override
    public void display() {
        System.out.println("Name of class is Engineer");
    }
    
    public void displayBoth() {
        display();
        super.display();
    }
}

class Exp45 {
    public static void main(String[] args) {
        Engineer eng = new Engineer();
        eng.displayBoth();
    }
}
