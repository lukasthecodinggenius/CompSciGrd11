
package my_application;

import java.util.Scanner;

class My_Application {
        
 
    public static void main(String[] args) {
        
        Scanner scan1 = new Scanner(System.in);
        
        
      System.out.println("Enter 3 Numbers: ");
       
      int num1 = scan1.nextInt();
      int num2 = scan1.nextInt();
      int num3 = scan1.nextInt();
      
      if (num1 > num2) {
          if (num1 > num3) {
              System.out.println(num1 + " is the greatest number");
          } else {
              System.out.println(num3 + " is the greatest number");
          }
      } else {
          if ((num2 > num1) && (num2 > num3)) {
              System.out.println(num2 + " is the greatest number");
          }
      }
      
     
              
              
              } 
    }
    

