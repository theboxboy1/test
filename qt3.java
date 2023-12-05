/**
 *
 * @author zakariyayahmad
 */

// qt 3

import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
     
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Input an integer: ");
    
    int num = scanner.nextInt();
    
    if(num % 2 == 0){
        System.out.println("Number is even");
             
    }
    
    else{
        System.out.println("Number is odd");
    }

    scanner.close();
    
    
   
  
    }

} 
              
