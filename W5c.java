public class W5c {

    class Shape {
        void displayA() {
            System.out.println("Area => ");
        }
    }

    class Circle extends Shape {
        void displayD(double r) {
            System.out.println("of circle : " + 3.14 * r * r);
        }
    }

    class Rectangle extends Shape {
        void displayP(int l, int b) {
            System.out.println("of rectangle : " + l * b);
        }
    }

    public static void main(String[] args) {

        //W5c obj = new W5c(); if want can use 


        Rectangle d = new Rectangle();
        Circle a = new Circle();

        d.displayA();
        a.displayD(3);
        d.displayP(3, 3);
    }
}