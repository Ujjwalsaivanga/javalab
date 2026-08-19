class W6c {
    
    static interface Person {
        void displayName();  
    }
    
    static interface Student extends Person {
        void displayMarks();  
    }
    
    static class CollegeStudent implements Student {
        
        @Override
        public void displayName() {
            System.out.println("vasii");  
        }
        
        
        @Override
        public void displayMarks() {
            System.out.println("marks is 90");
        }
    }
    
    public static void main(String[] args) {
        
        CollegeStudent c = new CollegeStudent();
        c.displayName();   
        c.displayMarks();  
        
        
    }
}