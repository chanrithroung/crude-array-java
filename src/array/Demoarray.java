package array;
import java.util.Scanner;
public class Demoarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = new int[10];
        int n;
        System.out.print("How many number do you want to input? ");
        n = sc.nextInt();
        
        
        for(int i =0; i < n; i++) {
            System.out.print("enter a value to nums["+i+"]:");
            nums[i] = sc.nextInt();
        }
        
        
        for(int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
        
        
       
  
    }
    
}
