import java.util.Scanner; //initialize scanner

class Main {
  public static void main(String[] args) {

Scanner value = new Scanner(System.in);

System.out.println("What Country are you from? Type your answer below: ");

String country = value.nextLine();

if (country == "Canada") {

  System.out.println("What is on Canada's Flag? a) Poutine b) A Beaver c) Maple Leaf d) Maple Syrup. Type a, b, c or d");
    String trivia1 = value.nextLine();

  if (trivia1 == "c") {
    System.out.println("Correct! You know a lot about your country");
    System.exit(1)
  } else {
    System.out.println("Incorrect, you should know more about your country");
    System.exit(1);
  }

} else if (country == "")




  } 

  }
