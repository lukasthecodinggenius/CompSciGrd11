import java.util.Scanner; //initialize the scanner

class Main {
  public static void main(String[] args) {

Scanner value = new Scanner(System.in); //declare scanner

System.out.println("Enter Number 1: "); //ask the user for the first number

int num1 = value.nextInt(); //take input from the user

System.out.println("Enter Number 2"); //ask user for 2nd number

int num2 = value.nextInt(); //take input from the user

if (num1 > num2) {
  System.out.println(num1 + " is greater than " + num2); //prints this if the first number is greater than the second
} else if (num1 < num2) {
  System.out.println(num1 + " is less than " + num2); //prints this statement if the 2nd number is greater then the first
} else {
  System.out.println(num1 + " is equal to " + num2); //prints this if both the numbers share the same value
}



  } 
}
