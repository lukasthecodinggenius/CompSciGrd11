
package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
        //Using a for loop to print numbers from 1 to 5
        
        System.out.println("Using for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            
        }

        //Using a while loop to print numbers from 1 to 5
        
        System.out.println("Using while loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
            
        }

        //Using a do-while loop to print numbers from 1 to 5
        
        System.out.println("Using do-while loop:");
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 5);
       
        
    }
    
}
