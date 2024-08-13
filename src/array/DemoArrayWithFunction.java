package array;
import java.util.Scanner;
public class DemoArrayWithFunction {
    static Scanner sc = new Scanner(System.in); 
    static void input(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("enter a value for arr["+i+"]:");
            arr[i] = sc.nextInt();
        }
    }
    
    static int []input(int n) {
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("enter a value for arr["+i+"]:");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    static void output(int arr[], int length) {
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    
    static int findMax(int[] arr, int n) {
        // n = 5
        int max = arr[n-1];
        for(int i = n-2; i >= 0; i--) 
            if(max < arr[i]) max = arr[i];
        return max;
    }
    
    public static void main(String[] args) {
        System.out.print("How many number do you want to input? : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr = input(n);
        output(arr, n);
        int max = findMax(arr, n);
        System.out.println("The maximum number of array is "+ max);
//        System.out.println(input(3)[2]);
        
        
        
    }
}
