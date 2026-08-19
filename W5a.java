

public class W5a {

    public static void main(String[] args) {
class Person {
    void displayP() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    void displayS() {
        System.out.println("I am a student");
    }
}

        Student s = new Student();

        s.displayP();   // inherited from Person
        s.displayS();   // Student's own method
    }
}