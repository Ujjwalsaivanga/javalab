// Animal.java
interface Animal {
    void sound();
}

// Dog.java
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}