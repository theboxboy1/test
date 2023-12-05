/**
 *
 * @author zakariyayahmad
 */

// qt 3

import java.util.Scanner; // imports scanner class

public class Notes {
    public static void main(String[] args) {
     
    Scanner scanner = new Scanner(System.in); // creates scanner variable 'scanner'
    
    System.out.println("Input an integer: ");
    
    int num = scanner.nextInt(); // assigns integer variable 'num' to the value the user inputs using scanner class
    
    if(num % 2 == 0){ // if the remainder of num is 0 when divided by 2, this means that num is an even number
        System.out.println("Number is even"); // if true, prints out that the number is even
             
    }
    
    else{ // if the above condition is not true, num must logically be an odd number as it can only be one of the two
        System.out.println("Number is odd"); 
    }

    scanner.close(); // stops taking input from the user
    
    
   
  
    }

} 
              
