public class W5b{

public static void main(String[] args){
class Animal{
void displayA(){
System.out.println("i am animal");}
}
class Dog extends Animal{
void displayD(){
System.out.println("I am dog");
}
}
class Puppy extends Dog{
void displayP(){
System.out.println("i am puppy");
}
}
Puppy d = new Puppy();
d.displayA();
d.displayD();
d.displayP();



}}