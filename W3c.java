public class W3c{
public static void main(String[] args){
class Bank{
void interest(int i){
System.out.println("the interest rate is " + i + "%");
}}
class SBI extends Bank{
void interest(int i){
System.out.println("the interest rate is " + i + "%");
}}
Bank b=new SBI();
b.interest(12);









}}
