
class Person {
    public Person() {
        System.out.println("Person class");
    }
}

class Student50 extends Person {
    public Student50() {
        super();
        System.out.println("Student class");
    }
}

class Exp50 {
    public static void main(String[] args) {
        Student50 s = new Student50();
    }
}
