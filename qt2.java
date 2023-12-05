/**
 *
 * @author zakariyayahmad
 */

// qt 2

import java.util.Scanner; // imports scanner class

public class Notes {
    public static void main(String[] args) {
     
    Scanner scanner = new Scanner(System.in); // creates scanner variable
    
    System.out.println("Input two natural numbers: ");
    
    int num1 = scanner.nextInt(); // assigns integer input value to num1
    int num2 = scanner.nextInt(); // assigns integer input value to num2
    
    int sum = 0;
    
    for(int i = num1; i <= num2; i++){  // for loop which sets the range in which the numbers are added
        sum += i;                        // the starting value is num1 and the loop iterates over the code until it reaches the end value, num2
        // each time the loop iterates, the value of i is added to the sum. For example, sum = 0+1+2+3....
    }
    System.out.println(sum); // prints out the final result, the sum

        scanner.close(); // stops taking input from user
  
    }

} 
              
