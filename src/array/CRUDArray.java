package array;
import java.util.Scanner;

public class CRUDArray {
    static Scanner sc  = new Scanner(System.in);
    
    
    // Creater 
    
    static int []input(int n) {
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter a value for position "+i+" : ");
            arr[i] = sc.nextInt();
        }
        
        return arr;
    }
    
    
    // Read
    static void output(int arr[], int n) {
        System.out.println("Here you have "+n+" number in array, there are : ");
        for(int i = 0;i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    
    // Search
    static void search(int arr[], int n) {
        int target;
        boolean isFound = false;
        System.out.print("Enter your target : ");
        target = sc.nextInt();
        
        for(int i =0; i < n; i++) 
            if(target == arr[i]) {
                System.out.println("Found "+target+" in the position "+i);
                isFound = true;
                break;
            } else {
                if(i==n-1)
                    System.out.println("Search not found!!!");
            }
               
        
        
        System.out.println("");
            
//        if(!isFound) System.out.println("Search not found!!!!");
        
    }
    
    
    // Update 
    
    static void update(int arr[], int n) {
        output(arr, n);
        int target;
        System.out.println("There is all number.");
        System.out.print("Enter a number do you want to update : ");
        target = sc.nextInt();
        // {10, 20, 100, 40}
        
//        target = 30
        for(int  i = 0; i < n; i++) {
            if(target == arr[i]) {
                System.out.print("Enter a value for position "+i+" : ");
                arr[i] = sc.nextInt();
                System.out.println("Update succesfull");
            }
        } 
    }
    
    // Delete
    static int delete(int numbers[], int size) {
        int target;
        System.out.print("Enter a target number : ");
        target = sc.nextInt();
        
        for(int i = 0; i < size; i++) {
            if(numbers[i] == target) {
                for(int j = i; j < size-1; j++) {
                    numbers[j] = numbers[j+1];
                }
                return size - 1;
            }else if(i==size-1) {
                System.out.print("The target you want to delete not found!!!!");
            }
        }
        return size;
    }
    
    
    // Insert
    
    
    // Sort
    
    static void menu() {
        System.out.println("-----========[ Menu ]======-------------");
        System.out.println("1. Create array of number");
        System.out.println("2. Read all number from array");
        System.out.println("3. Search a number in array");
        System.out.println("4. Update an element");
        System.out.println("5. Delete an elemenet");
        System.out.println("6. Insert an element");
        System.out.println("7. Sort");
        System.out.println("8. Exits");
    }
         
        
    
    
    public static void main(String[] args) {
        int arr[] = new int[100], op, n = 0;
        
        
        
        do {
            menu();
            System.out.print("Please select one option : ");
            op = sc.nextInt();
            switch(op) {
                case 1: {
                    System.out.print("How many number do you want to create? :");
                    n = sc.nextInt();
                    arr = input(n);
                }break;
                 // Read all data from array of number
                case 2:{
                    output(arr, n);
                }break;    
                
                case 3:{
                    search(arr, n);
                }break;  
                
                
                case 4:{
                    update(arr, n);
                }break; 
                
                case 5:{
                    n = delete(arr, n);
                }break; 
            }
        } while(op!=8);
        
        
        
        
        
    }
    
    
    
}
