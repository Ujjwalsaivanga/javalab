// Animal.java

// Main.java
public class W6a {
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

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}