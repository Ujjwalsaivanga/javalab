class Animal{
void sound(){
System.out.println(" meoww " );
}
}
class Dog extends Animal{
@Override
void sound(){
System.out.println(" boww boww");
}}
public class W3d{
public static void main(String[] args){



Animal d= new Dog();
d.sound();
}}