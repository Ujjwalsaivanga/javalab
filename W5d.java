abstract class Animal {
    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    // Providing implementation for abstract method
    @Override
    void sound() {
        System.out.println("Dog is barking");
    }
}

public class W5d {  

    public static void main(String[] args) {
        Animal d = new Dog();

        d.sound();
        d.eat();
    }
}