import java.util.Scanner; //initialize scanner

class Main {
  public static void main(String[] args) {

Scanner value = new Scanner(System.in);


System.out.println("Enter Age:");

int age = value.nextInt();  //take input from the user

if (age <= 13) {
    System.out.println("You are a child");        //outputs for differents ages
} else if ((age <= 19) && (age >= 13)) {
    System.out.println("You are a teen");
} else if ((age <= 65) && (age >= 20)) {
    System.out.println("You are an adult");
} else if (age >= 65) {
    System.out.println("You are a senior citizen");
} else {
    System.out.println("Age Invalid"); //outputs this statement if the user puts invalid term
}










  }
}
