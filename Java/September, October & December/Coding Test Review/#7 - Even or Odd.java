
package my_application;

import java.util.Scanner;

class My_Application {
        
 
    public static void main(String[] args) {
        
        Scanner scan1 = new Scanner(System.in);
        
        
      System.out.println("Enter Number: ");
       
      int num1 = scan1.nextInt();
      
     if (num1 % 2 == 0) {
         System.out.println("Number is even");
     } else {
         System.out.println("Number is odd");
     } 
         
     }
