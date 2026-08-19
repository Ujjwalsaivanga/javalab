public class W3b{
public static void main(String[] args){

class area{
int shape(int l){
return (l*l);}
int shape(int l,int b){
return (l*b);
}
double shape(double r){
return (3.14*r*r);
}
}

area a= new area();
a.shape(2);
a.shape(4,5);
a.shape(1);
System.out.println("square : " + a.shape(2));
System.out.println("rectangle  : " + a.shape(4,5));
System.out.println("circle : " + a.shape(1));
}}