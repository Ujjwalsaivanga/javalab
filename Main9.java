

public class Main9 {

    public static void main(String[] args) {
class Marks {

    void calculate(int math, int phy, int chem) {
        System.out.println("The total for three subjects is: " + (math + phy + chem));
    }

    void calculate(int math, int phy, int chem, int eng) {
        System.out.println("The total for four subjects is: " + (math + phy + chem + eng));
    }
}

        Marks c = new Marks();

        c.calculate(90, 90, 90);
        c.calculate(90, 90, 90, 90);
    }
}