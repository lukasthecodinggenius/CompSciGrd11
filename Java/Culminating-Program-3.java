
package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
        //'if', 'else' and 'elseif' statements
        
        int age = 16; //declaring age variable
        
        if (age < 13) { //checks if the age is less than 13
            System.out.println("You are a child");
        } else if (age < 18) { //checks if the age is less than 18
            System.out.println("You are a teenager");
        } else { //will run if the other conditions are both false
            System.out.println("You are an adult");
        }
        
       
        
    }
    
}
