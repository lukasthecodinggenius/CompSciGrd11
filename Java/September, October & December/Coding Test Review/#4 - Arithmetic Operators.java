

import java.util.Scanner;

class Main {
        
 
    public static void main(String[] args) {
        
        Scanner scan1 = new Scanner(System.in);
        
        
        System.out.println("First Number: ");
        int num1 = scan1.nextInt();
        System.out.println("Second Number: ");
        int num2 = scan1.nextInt();
        System.out.println("Third Number: ");
        int num3 = scan1.nextInt();
      
        System.out.println("Calculations: ");
        
        //addition operator
        System.out.println("Addition");
        System.out.println(num1 + num2);
        //subtraction operator
        System.out.println("Subtraction");
        System.out.println(num2 - num3);
        //multiplication operator
        System.out.println("Multiplication");
        System.out.println(num1 * num2);
        //division operator
        System.out.println("Division");
        System.out.println(num1 / num2);
        //modulo operator
        System.out.println("Modulo");
        System.out.println(num2 % num3);
        
     
    }
    
}
