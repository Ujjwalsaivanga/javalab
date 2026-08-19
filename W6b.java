public class W6b {
    
    static interface Printable {
        void print();
    }

    static interface Showable {
        void show();
    }

    static class Demo implements Printable, Showable {
        @Override
        public void print() {
            System.out.println("Printing document...");
        }
        
        @Override
        public void show() {
            System.out.println("Showing document...");
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo(); 
        demo.print();
        demo.show();
    }
}