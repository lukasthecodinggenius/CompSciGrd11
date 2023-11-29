import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
Scanner value = new Scanner(System.in);
System.out.println("Enter number: ");

int num1 = value.nextInt();

if ((num1 % 2) == 0) {
  System.out.println("Number is even");
} else {
  System.out.println("Number is odd");
}

  } 

  }
