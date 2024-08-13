package demofunction;
public class DemoFunction {
    
    // none return function
    void sum() {
        int x, y;
        x = 100;
        y = 200;
        System.out.println("x+y="+(x+y));
    }
    
    // non return function with parameter
    void sum(int x, int y) {
        System.out.println("x+y="+(x+y));
    }
    
    
    public DemoFunction() {
        sum();
        sum(10, 29);
    }
    
    public static void main(String[] args) {
       new DemoFunction();
    }
    
    
}
