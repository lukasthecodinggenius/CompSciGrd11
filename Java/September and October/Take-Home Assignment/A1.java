import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
Scanner value = new Scanner(System.in);

System.out.println("Enter Name: ");

String name = value.nextLine();

System.out.println("Enter 2nd Name: ");

String name2 = value.nextLine();

if (name.equals(name2)) {
  System.out.println("Both names are the same!");
} else  {
  System.out.println("The names are different");
}

  }
}

