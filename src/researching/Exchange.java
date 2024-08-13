package researching;
import java.util.Scanner;
public class Exchange {
    
    static int sum(int n) {
        return (n==1) ? 1 : n + sum(n-1);
    }  
    
    
    
    public static void main(String[] args) {
        int i;
        for(i = -2; i < 400; i++) {
            if(i==5) break;
            System.out.println(i+" ");
        }
        
        
        
    }
    
}
