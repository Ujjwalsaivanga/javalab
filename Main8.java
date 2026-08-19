class Student {
    int id;
    String name;
    String branch;
    int year;
    float cgpa;

    void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(branch);
        System.out.println(year);
        System.out.println(cgpa);
    }
}
public class Main8{

public static void main(String[] args){
Student s1 = new Student();
s1.id=61;
s1.name="ujjwal";
s1.branch="aids";
s1.year=2;
s1.cgpa=9.00f;
s1.display();
}}