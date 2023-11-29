import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
Scanner value = new Scanner(System.in);
System.out.println("Enter Radius ");

int radius = value.nextInt();
final double area = radius * radius * 3.14159;
if (radius > 0) {
  System.out.println("Radius is " + area);
} else {
  System.out.println("Negative Input");
}

  } 

  }
